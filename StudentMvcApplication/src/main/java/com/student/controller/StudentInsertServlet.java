package com.student.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.student.model.Student;
import com.student.service.StudentService;


@WebServlet("/insertStudent")
public class StudentInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public StudentInsertServlet() {
        super();
       
    }
    
    

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		Student student = new Student(); 
		
		student.setStuId(Long.parseLong(request.getParameter("stuId")));
		student.setStuName(request.getParameter("stuName"));
		student.setMark1(Integer.parseInt(request.getParameter("mark1")));
		student.setMark2(Integer.parseInt(request.getParameter("mark2")));
		student.setMark3(Integer.parseInt(request.getParameter("mark3")));

		
		
		System.out.println(student.toString());
		
		
		StudentService serv = new StudentService(); 
		Boolean insertStatus = serv.insertStudent(student); // stuId, stuName, mark 
		
		response.setContentType("text/html");
		response.getWriter().append("<h1 style='color:red'> Inserted status is "+insertStatus+"</h1>");
		
		HttpSession session = request.getSession();
		session.setAttribute("insertStatus",insertStatus );
		
		
		
		
		
		
		
//		RequestDispatcher rd = request.getRequestDispatcher("/index.html"); 
//		rd.include(request, response); 
//		
		
		response.sendRedirect("displayStudentList");
		
		
	}

}
