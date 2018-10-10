package com.Orcale.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		Student s1 = new Student("马飞飞", "女", 20, "01");
		Student s2 = new Student("赵学学", "女", 22, "03");
		Student s3 = new Student("帅帅", "男", 20, "09");
		Student s4 = new Student("哈哈", "男", 3, "04");
		Student s5 = new Student("李四", "男", 25, "15");

		List<Student> student = new ArrayList<Student>();
		
		student.add(s1);
		student.add(s2);
		student.add(s3);
		student.add(s4);
		student.add(s5);
		
		//按顺序打印输出
		for(int n = 0;n < student.size();n++) {
			System.out.println(student.get(n).toString());
		}
		
		System.out.println();
		
		//按年龄(age)升序打印输出,若年龄相同则按学号(studentNumber)升序打印输出
		Collections.sort(student);
		
		for(int n = 0;n < student.size();n++) {
			System.out.println(student.get(n).toString());
		}
		
		System.out.println();
		
		//迭代器遍历
		Iterator<Student> it = student.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println(s.toString());
		}
		
	}

}
