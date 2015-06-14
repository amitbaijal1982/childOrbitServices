package com.childOrbit.dao;

import org.junit.Test;

import static org.junit.Assert.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import com.childOrbit.bean.Student;

@ContextConfiguration("/Test-context.xml")
public class StudentDAOTests extends AbstractTransactionalJUnit4SpringContextTests {

	@Autowired
	private StudentDAO dao;
	
	@Test
	public void insertStudent(){
 
	 Student std = new Student(1,"name","100","10","A",45,23,3);
	 dao.insert(std);
	}
	
	@Test
	public void getAllStudent(){

	 Student Std1 = new Student(1,"name","100","10","A",45,23,3);
	 dao.insert(Std1);
	 assertEquals(dao.findAll().size(), 1);
	}
}
