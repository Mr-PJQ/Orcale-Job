package com.Orcale.List;

public class Student implements Comparable<Object>{

	private String name;
	private String sex;
	private int age;
	private String studentNumber;
	
	public Student() {
		
	}
	
	public Student(String name, String sex, int age, String studentNumber) {
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.studentNumber = studentNumber;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	@Override
	public int compareTo(Object o) {
		Student student = (Student) o;
		if(this.getAge() == student.getAge()) {
			return this.getStudentNumber().compareTo(student.getStudentNumber());
		}else {
			return this.getAge() - student.getAge();
		}
	}
	
	@Override
	public String toString() {
		return "Student [ " + name + "  " + sex + "  " + age + "  " + studentNumber + " ]";
	}

}
