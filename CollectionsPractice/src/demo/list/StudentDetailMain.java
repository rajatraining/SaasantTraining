package demo.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class StudentDetailMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		
		List<Student> stuList = new ArrayList<Student>(); 
		
		
		System.out.println("Insert the student information ");
		System.out.println("******************************* ");
		
		String decision = "N"; 
		int stuNo= 1; 
		
		do {
			
			Student stu = new Student(); 
			
			System.out.println("Enter the Student "+stuNo);
		
		
		System.out.println("Enter the roll Id");
		
		int stuRollId= sc.nextInt(); 
		
		stu.setRollId(stuRollId);
		
		System.out.println("Enter the Student Name ");
		
		String name = sc.next(); 
		stu.setStuName(name);
		
		System.out.println("Enter the Marks");
		String userDecision = "n";
		int i= 1 ;
		List<Integer> marks = new ArrayList<Integer>(); 
		
		int total = 0 ; 
		
		do {
			
			System.out.println("Enter the mark -"+i);
			int m = sc.nextInt(); 
			
			marks.add(m);
			total = total + m ; 
			
			System.out.println("Do you want to insert another Mark -(y/n)");
			userDecision = sc.next(); 
			
			i++; 
			
		}while(userDecision.equalsIgnoreCase("y"));
		
		Collections.sort(marks); 
		

		stu.setMarks(marks);
		stu.setTotal(total); 
		
		System.out.println(stu.toString());
		
		
		System.out.println("Do you want to insert another student info (y/n)");
		
		decision = sc.next(); 
		
		stuNo++; 
		
		stuList.add(stu); 
		
		}
		while(decision.equalsIgnoreCase("Y")); 
	
		System.out.println("******************************* ");

		System.out.println("Inserted Value ");
		System.out.println("******************************* ");

		
		System.out.println(stuList);
		
		
		
		
		Collections.sort(stuList); 
		
		System.out.println("******************************* ");

		System.out.println("After Soring by default CompareTo");
		System.out.println("******************************* ");

		
		System.out.println(stuList);

		
		Collections.sort(stuList, Student.studentNameCompare); 
		System.out.println("******************************* ");

		System.out.println("After sorted by student Name ");
		System.out.println("******************************* ");

		System.out.println(stuList);

		
		
		
		
	}

}
