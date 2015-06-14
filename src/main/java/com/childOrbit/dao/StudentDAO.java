package com.childOrbit.dao;
import java.util.List;

import com.childOrbit.bean.Student;

public interface StudentDAO {

	public void insert(Student student);
	public void update(Student student);
	public void delete(String studentId);
	public List<Student> get_name_admissionId(Student student);
	
//	public List<Student> findAll();
	public List<Student> search(String key,String value);
}
