package com.student.service;

import java.util.List;

import com.student.dao.StudentDao;
import com.student.model.Student;

public class StudentService {
	
	StudentDao stuDao = new StudentDao();
	
	public boolean insertStudent(Student stu )
	{
		
		Integer total = stu.getMark1() + stu.getMark2() + stu.getMark3(); 
		Integer average = total / 3 ;
		
		
		stu.setTotal(total);
		stu.setAverage(average);
		
		System.out.println(stu);
		
		 
		int rowsInserted = stuDao.insertStudent(stu);
		
		boolean insertStatus = (rowsInserted > 0) ?true : false; 
		
		return insertStatus; 
		
	}
	
	public List<Student> getList()
	{
		////
		
		// Sort it based on total 
		
		
		return stuDao.getStuList();
	}
	
	
	
	

}
