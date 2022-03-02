package com.student.model;

public class Student {
	
	private Long stuId; 
	private String stuName;
	private Integer mark1; 
	private Integer mark2; 
	private Integer mark3; 
	private Integer total ;
	private Integer average;
	public Long getStuId() {
		return stuId;
	}
	public void setStuId(Long stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public Integer getMark1() {
		return mark1;
	}
	public void setMark1(Integer mark1) {
		this.mark1 = mark1;
	}
	public Integer getMark2() {
		return mark2;
	}
	public void setMark2(Integer mark2) {
		this.mark2 = mark2;
	}
	public Integer getMark3() {
		return mark3;
	}
	public void setMark3(Integer mark3) {
		this.mark3 = mark3;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public Integer getAverage() {
		return average;
	}
	public void setAverage(Integer average) {
		this.average = average;
	}
	
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", mark1=" + mark1 + ", mark2=" + mark2 + ", mark3="
				+ mark3 + ", total=" + total + ", average=" + average + "]";
	} 


	
	

}
