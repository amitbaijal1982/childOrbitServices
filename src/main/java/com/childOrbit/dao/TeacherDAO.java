package com.childOrbit.dao;

import java.util.List;

import com.childOrbit.bean.Teacher;

public interface TeacherDAO {

	public void insert(Teacher teacher);
	public void update(Teacher teacher);
	public void delete(String id);
	public List<Teacher> search(String key,String value);
	public List<Teacher> findAll();
}
