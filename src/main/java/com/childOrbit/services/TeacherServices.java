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

import com.childOrbit.bean.Teacher;
import com.childOrbit.dao.TeacherDAO;
@RestController
public class TeacherServices {

		@Autowired
		TeacherDAO teacherDao;
		
		@RequestMapping(value="/insert/teacher",method = RequestMethod.POST,headers="Accept=application/json",produces="application/json")
		 @ResponseBody
		  public void addStudent( @Valid @RequestBody Teacher teacher) throws ParseException { 
			teacherDao.insert(teacher);
		  }
		@RequestMapping(value="/update/teacher",method = RequestMethod.POST,headers="Accept=application/json",produces="application/json")
		  public List<Teacher> updateStudent(@Valid @RequestBody Teacher teacher) throws ParseException { 
		 
			teacherDao.update(teacher);
		   return teacherDao.findAll();
		  }
		@RequestMapping(value="/search/teacher/{key}/{val}",method = RequestMethod.GET,headers="Accept=application/json",produces="application/json")
		  public List<Teacher> getStudent_by_addmissionid(@PathVariable String key,@PathVariable String val) throws ParseException { 
		 
		  return teacherDao.search(key,val);
		   
		  }
		
		@RequestMapping(value="/delete/teacher/{id}",method = RequestMethod.GET,headers="Accept=application/json",produces="application/json")
		  public void deleteStudent(@PathVariable String id) throws ParseException { 
		 
		  teacherDao.delete(id);
		   
		  }
}
