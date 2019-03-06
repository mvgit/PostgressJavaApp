package com.adiva.controller;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.adiva.dbaccess.Student;
import com.adiva.dbaccess.StudentJDBCTemplate;
 
/*
 * author: Mohan Vaze
 * 
 */
 
@Controller
public class AdivaHelloWorld {

	@Autowired
	private StudentJDBCTemplate studentJDBCTemplate;
	
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
		
		List<Student> students = null;
		
		if(studentJDBCTemplate!=null){
			students = studentJDBCTemplate.listStudents();
		} else{
			System.out.print("context is null.");
		}
		
		return new ModelAndView("welcome", "students", students);
	}
}
