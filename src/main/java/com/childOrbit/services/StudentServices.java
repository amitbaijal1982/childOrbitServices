package com.childOrbit.services;

import java.text.ParseException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.childOrbit.bean.Student;
import com.childOrbit.dao.StudentDAO;

@RestController
public class StudentServices {
	
	@Autowired
	StudentDAO studentParentDao;
	
	
	@RequestMapping(value="/student/insert",method = RequestMethod.POST,headers="Accept=application/json",produces="application/json")
	 @ResponseBody
	  public List<Student> addStudent( @Valid @RequestBody Student student) throws ParseException { 
	 
		studentParentDao.insert(student);
	  return studentParentDao.get_name_admissionId(student);
	   
	  }
	@RequestMapping(value="/student/update",method = RequestMethod.POST,headers="Accept=application/json",produces="application/json")
	  public List<Student> updateStudent(@RequestBody Student student) throws ParseException { 
	 
		studentParentDao.update(student);
		 return studentParentDao.get_name_admissionId(student);
	   
	  }
	
	@RequestMapping(value="/student/select/{key}/{val}",method = RequestMethod.GET,headers="Accept=application/json",produces="application/json")
	  public List<Student> getStudent_by_addmissionid(@PathVariable String key,@PathVariable String val) throws ParseException { 
	 
	  return studentParentDao.search(key,val);
	   
	  }
	
	@RequestMapping(value="/student/delete/{id}",method = RequestMethod.GET,headers="Accept=application/json",produces="application/json")
	  public void deleteStudent(@PathVariable String id) throws ParseException { 
	 
	  studentParentDao.delete(id);
	   
	  }

}
