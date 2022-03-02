package com.student.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.student.model.Student;

public class StudentDao {
	
	String hostName = "jdbc:mysql://localhost:3306/saasant"; 
	String user= "root";
	String password= "root1234";
	
	
	public int insertStudent(Student stu)
	{
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(hostName, user, password);
			
			PreparedStatement ps = con.prepareStatement("INSERT INTO STUDENT_INFO "
					+ "(STU_ID, STU_NAME, MARK1, MARK2,MARK3, TOTAL, AVERAGE) values (?,?,?,?,?,?,?)"); 
			
			ps.setLong(1, stu.getStuId());
			ps.setString(2, stu.getStuName());
			ps.setInt(3, stu.getMark1());
			ps.setInt(4, stu.getMark2());
			ps.setInt(5, stu.getMark3());
			ps.setInt(6, stu.getTotal());
			ps.setInt(7, stu.getAverage());
			
			
			int rowCount = ps.executeUpdate(); 
			
			
			return rowCount; 
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			return 0; 
		} 
	}
	
	
	public List<Student> getStuList()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(hostName, user, password);
			
			Statement stmt = con.createStatement(); 
			
			ResultSet rs = stmt.executeQuery("select * from student_info");
			
			List<Student> stuList = new ArrayList<Student>(); 
			
			while (rs.next())
			{
				Student stu = new Student(); 
				
				stu.setStuId(rs.getLong("stu_id")); 
				stu.setStuName(rs.getString("stu_name"));
				stu.setMark1(rs.getInt("mark1"));
				stu.setMark2(rs.getInt("mark2"));
				stu.setMark3(rs.getInt("mark3"));
				stu.setTotal(rs.getInt("total"));
				stu.setAverage(rs.getInt("average"));
				
				stuList.add(stu);
				
			}
			
			
			return stuList; 
			

			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			return null; 
		}
		
		
	}
	
	
	
	
	
	

}
