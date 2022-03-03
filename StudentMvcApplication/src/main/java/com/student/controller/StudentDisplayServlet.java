package com.student.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
		
		Cookie cookie = new Cookie("insertStatus","Welcome_Samplee"); 
		response.addCookie(cookie); 
		
		
		
		Cookie[] fromClient = request.getCookies();
		
		for(Cookie c : fromClient)
		{
			if(c.getName().equals("count"))
			{
				Integer count = Integer.parseInt(c.getValue());
				c.setValue((count++).toString());
			}
			else
			{
				Cookie cookie1 = new Cookie("count","1"); 
				response.addCookie(cookie); 
			}
		}
		
	//	cookie.setMaxAge(0);
		
		
		
		HttpSession session = request.getSession(); 
		//session.invalidate();
		
		//String status = (String) session.getAttribute("insertStatus");
		
		response.setContentType("text/html");
	
		PrintWriter out = response.getWriter(); 
		
		
		// stuList = List
		
		session.setAttribute("stuList", stuList);
		
		session.setAttribute("username", "Admin"); 
		
		for(Student s : stuList)
		{
			out.append(s.toString());
		}
		
		response.sendRedirect("displayStudent.jsp");
		
		
	}

	
	
	
	
	
	
	
	
	
}
