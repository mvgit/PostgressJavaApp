package com.adiva.controller;
 
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.adiva.dbaccess.Student;
import com.adiva.dbaccess.StudentDaoImpl;

/*
 * author: Mohan Vaze
 * 
 */


 
@Controller
public class AdivaHelloWorld {

	@Autowired
	private StudentDaoImpl studentDao;
	 private static final Logger logger 
     = LoggerFactory.getLogger(AdivaHelloWorld.class);

	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
		
		logger.info("helloWorld start");
		
		List<Student> students = null;
		
		if(studentDao!=null){
			students = studentDao.listStudents();
			
		} else{
			System.out.print("context is null.");
		}
		
		logger.info("helloWorld end");
		return new ModelAndView("welcome", "students", students);
	}
}
