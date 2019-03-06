package com.adiva.controller;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;
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
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello Amfam, Spring MVC Tutorial</h3>This message is coming from HelloWorld.java **********</div><br><br>";
		return new ModelAndView("welcome", "students", students);
	}
}
