package com.Orcale.List;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		Student s1 = new Student("啦啦啦", "女", 18, "12");
		Student s2 = new Student("张三", "男", 28, "20");
		Student s3 = new Student("王五", "男", 28, "18");

		LinkedList<Student> s = new LinkedList<Student>();
		s.add(s1);
		s.add(s2);
		s.add(s3);
		
		Iterator<Student> it = s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
