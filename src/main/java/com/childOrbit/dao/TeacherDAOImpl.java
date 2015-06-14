package com.childOrbit.dao;

import java.util.HashMap;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.childOrbit.bean.Teacher;
@Repository
public class TeacherDAOImpl implements TeacherDAO{
	@Autowired
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
 
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public void insert(Teacher teacher){
		String sql = "INSERT INTO teacherinfo " +
				"(name, dateOfBirth, gender, address, state, city, mobile, alternateMobile, busRouteId, busStopId, dateOfJoining, photo) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
	
		jdbcTemplate = new JdbcTemplate(dataSource);
		
		jdbcTemplate.update(sql, new Object[] { teacher.getName(),teacher.getDateOfBirth(),teacher.getAddress(),teacher.getAddress(),
				teacher.getState(),teacher.getCity(),teacher.getMobile(),teacher.getAlternateMobile(),teacher.getBusRouteId(),
				teacher.getBusStopId(),teacher.getDateOfJoining(),teacher.getPhoto()
		});
	
	}
	public void update(Teacher teacher){
		String sql = "update teacherinfo " +
				" set name = ?, dateOfBirth = ?, gender = ?, address = ?, state = ?, city = ?, mobile = ?, "
				+ "alternateMobile = ?, busRouteId = ?, busStopId = ?, dateOfJoining = ?, photo = ? where teacherId = ?";
	
		jdbcTemplate = new JdbcTemplate(dataSource);
		
		jdbcTemplate.update(sql, new Object[] { teacher.getName(),teacher.getDateOfBirth(),teacher.getGender(),teacher.getAddress(),
				teacher.getState(),teacher.getCity(),teacher.getMobile(),teacher.getAlternateMobile(),teacher.getBusRouteId(),
				teacher.getBusStopId(),teacher.getDateOfJoining(),teacher.getPhoto(),teacher.getTeacherId()
		});
	
	}
	public void delete(String teacherId){
		 
		String sql = "delete from teacherinfo where teacherId = ?";
		jdbcTemplate = new JdbcTemplate(dataSource);
		
		jdbcTemplate.update(sql, new Object[] {teacherId   
		});
	}
	public List<Teacher> search(String key,String val) {
		// TODO Auto-generated method stub
		String select = "select * ";
		String from = "from teacherinfo ";	
		String where = "";

		HashMap<String, String> hm = new HashMap<String, String>();
	      
			hm.put("name","name");
		
			String keyHashValue = hm.get(key);
			switch(keyHashValue)
		      {
		         case "name" :
		        	 where = "where name LIKE '%"+val+"%' ";
		            break;
		      }
			
			String sql = select+from+where;
				System.out.println(sql);		
				jdbcTemplate = new JdbcTemplate(dataSource);
				List<Teacher> st  =jdbcTemplate.query(sql,
						new BeanPropertyRowMapper<Teacher>(Teacher.class));
		
			return st;
	}
	
	public List<Teacher> findAll() {
		// TODO Auto-generated method stub
		String sql = "select * from teacherinfo";
		jdbcTemplate = new JdbcTemplate(dataSource);
		List<Teacher> teachers  =jdbcTemplate.query(sql,
				new BeanPropertyRowMapper<Teacher>(Teacher.class));
		return teachers;
	}
}
