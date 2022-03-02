package com.student.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.student.model.Student;
import com.student.service.StudentService;


@WebServlet("/displayStudentList")
public class StudentDisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public StudentDisplayServlet() {
        super();
     
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		StudentService serv = new StudentService(); 
		List<Student> stuList = serv.getList(); 
		
		
		
		response.getWriter().append(stuList.toString());
	}

}
