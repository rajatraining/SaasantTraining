package demo.list;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class Student implements Comparable<Student>{
	
	private int rollId; 
	private String stuName; 
	
	private Map<String, Integer> marks; 
	
	//private List<Integer> marks; 
	
	
	private int total;
	
	
	public int getRollId() {
		return rollId;
	}
	public void setRollId(int rollId) {
		this.rollId = rollId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
//	public List<Integer> getMarks() {
//		return marks;
//	}
//	public void setMarks(List<Integer> marks) {
//		this.marks = marks;
//	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Student [rollId=" + rollId + ", stuName=" + stuName + ", marks=" + marks + ", total=" + total + "]\n";
	}
	
	
	@Override
	public int compareTo(Student o) {
		
		// 25 , 45 --> 25-45 = -20 --> RHS is bigger
		// 45, 25 --> 45 - 25 = 20 --> LHS is bigger
		// 25,25 --> 25-25 = 0 --> Equals 
		
		//return this.total - o.total ; // Ascending 
		return o.total - this.total; // Decending
		//return this.stuName.compareTo(o.stuName); 
	} 
	
	
	
	public static Comparator<Student> studentNameCompare = new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			
			return o1.stuName.compareTo(o2.stuName);
		}
		
		
	};
	
	public static Comparator<Student> rollIdCompare = new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			
			return o1.rollId - o2.rollId;
		}
		
		
	};


	public Map<String, Integer> getMarks() {
		return marks;
	}
	public void setMarks(Map<String, Integer> marks) {
		this.marks = marks;
	}
	
	
	
	
	
	
	
	
	
	
	

}
