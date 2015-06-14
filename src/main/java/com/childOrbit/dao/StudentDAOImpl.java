package com.childOrbit.dao;

import java.util.HashMap;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.childOrbit.bean.Student;

@Repository
public class StudentDAOImpl implements StudentDAO {
		
	@Autowired
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
 
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public void insert(Student student){
		
		String sql = "INSERT INTO studentinfo " +
				"(cardNo, name, admissionNo, clas, section, classRollNo, "
				+ "busRouteId, busStopId,  address, city, state, gender,dateOfBirth) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		jdbcTemplate = new JdbcTemplate(dataSource);
		
		jdbcTemplate.update(sql, new Object[] { student.getCardNo(),
				student.getName(), student.getAdmissionNo(),student.getClas(),student.getSection(),student.getClassRollNo()
				,student.getBusRouteId(),student.getBusStopId(),student.getAddress(),student.getCity(),student.getState(),
				student.getGender(),student.getDateOfBirth()
				
		});
		
		String sql1 = "select studentId from studentinfo where admissionNo = ?";
		jdbcTemplate = new JdbcTemplate(dataSource);
		
		String stid  =jdbcTemplate.queryForObject(sql1,new Object[] {student.getAdmissionNo()},
				String.class);
		
		 String sql2 = "INSERT INTO parentinfo(studentId, name, mobile, relation, password) VALUES (?,?,?,?,?)";
		 jdbcTemplate = new JdbcTemplate(dataSource);
			
			jdbcTemplate.update(sql2, new Object[] { stid,student.getFathername(),student.getFmobile(),"father",stid+student.getFmobile()
					
			});
			jdbcTemplate.update(sql2, new Object[] { stid,student.getMothername(),student.getMmobile(),"mother",stid+student.getMmobile()
					
			});	
			
	}
	
	public void update(Student student){
		 
		String sql = "update studentinfo set " +
			"cardNo=?,name=?, admissionNo=?, clas=?, section=?, classRollNo=? ,busRouteId=?, busStopId=?,  address=?, city=?, state=?, gender=?,dateOfBirth=? where studentId=?";
 
		jdbcTemplate = new JdbcTemplate(dataSource);
		
		jdbcTemplate.update(sql, new Object[] { student.getCardNo(),
				student.getName(), student.getAdmissionNo(),student.getClas(),student.getSection(),student.getClassRollNo()
				,student.getBusRouteId(),student.getBusStopId(),student.getAddress(),student.getCity(),student.getState(),
				student.getGender(),student.getDateOfBirth(),student.getStudentId()  
		});
		
		
		String sql2 = "update parentinfo set name=?, mobile=?, relation=? where studentId=?";
		
		 jdbcTemplate.update(sql2, new Object[] { student.getFathername(),student.getFmobile(),"father",student.getStudentId()
					
			});
		 jdbcTemplate.update(sql2, new Object[] { student.getMothername(),student.getMmobile(),"father",student.getStudentId()
				 
		 });
	}
	
	
	public void delete(String studentId){
		 
		String sql = "delete from studentinfo where studentId = ?";
		jdbcTemplate = new JdbcTemplate(dataSource);
		
		jdbcTemplate.update(sql, new Object[] {studentId   
		});
	}
	
	/*public List<Student> findAll() {
		// TODO Auto-generated method stub
		String sql = "select * from studentinfo";
		jdbcTemplate = new JdbcTemplate(dataSource);
		List<Student> students  =jdbcTemplate.query(sql,
				new BeanPropertyRowMapper(Student.class));
		return students;
	}*/
	public List<Student> get_name_admissionId(Student student) {
		// TODO Auto-generated method stub
		String sql = "select cardNo, name, admissionNo, clas, section, classRollNo,busRouteId, busStopId,  address, city, state, gender,dateOfBirth"
				+ " from studentinfo where admissionNo = ? and name = ?";
		jdbcTemplate = new JdbcTemplate(dataSource);
		List<Student> st  =jdbcTemplate.query(sql,new Object[] {student.getAdmissionNo(),student.getName()},
				new BeanPropertyRowMapper<Student>(Student.class));
		return st;
	}
	
	//1. Key - Mapping (3 mappings for students)
	//2. Like - if key is name use like in query
	//3. Do Teacher Page
	//4. Make generic service for single column search
	//5. Need one abstract class for return type
	//6. Keep mapping for Tablenames in hashmap
	//7. Keep mapping for Fieldnames in another hashmap to make generic query
	
	public List<Student> search(String key,String val) {
		// TODO Auto-generated method stub
		 
		String select = "select s.studentId, s.cardNo, s.name, s.admissionNo, s.clas, s.section, s.classRollNo, s.busRouteId,s.busStopId, s.address, s.city, s.state, s.gender,s.dateOfBirth, p1.name as fathername, p1.mobile fmobile,p2.name as mothername, p2.mobile mmobile ";
		String from = "from studentinfo s, parentinfo p1, parentinfo p2 ";	
		String where = "";
		String where_cond = "and p1.relation='father' and p2.relation='mother' and s.studentId = p1.studentId and s.studentId=p2.studentId";

		HashMap<String, String> hm = new HashMap<String, String>();
	      
			hm.put("name","name");
			hm.put("admissionNo","admissionNo");
			hm.put("cardNo","cardNo");
		
			String keyHashValue = hm.get(key);
			switch(keyHashValue)
		      {
		         case "name" :
		        	 where = "where s.name LIKE '%"+val+"%' ";
		            break;
		         case "admissionNo" :
		        	 where = "where s.admissionNo = "+val+" ";
		        	 break;
		         case "cardNo" :
		        	 where = "where s.cardNo= "+val+" ";
		        	 break;
		      }
			
			String sql = select+from+where+where_cond;
				System.out.println(sql);		
				jdbcTemplate = new JdbcTemplate(dataSource);
				List<Student> st  =jdbcTemplate.query(sql,
						new BeanPropertyRowMapper<Student>(Student.class));
		
			return st;
	}
	
}
