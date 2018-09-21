package com.iteratorDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

import com.enumDemo.ColorEnum;
import com.enumDemo.ConstantEnum;
import com.enumDemo.NameEnum;

public class IteratorDemo {
	// @Test
	public void f1() {
		List<String> lists = new ArrayList<String>();
		lists.add("001");
		lists.add("002");
		lists.add("003");
		lists.add("004");
		
		List<String> newLists = new ArrayList<String>();
		
		Iterator<String> iter = lists.iterator();
		String str = "";
		
		while (iter.hasNext()) {
			str = iter.next();
			System.out.println(str);
			if ("001".equals(str)) {
				iter.remove();
			} else {
				newLists.add(str);
			}
		}
		System.out.println(newLists);
	}
	
	@Test
	public void f2() {
		List<Student> stuList = new ArrayList<Student>(); 
		Student stu1 = new Student();
		stu1.setId("001");
		stu1.setName("张三");
		stu1.setColor("red color");
		
		Student stu2 = new Student();
		stu2.setId("002");
		stu2.setName("李四");
		stu2.setColor("green color");
		
		Student stu3 = new Student();
		stu3.setId("003");
		stu3.setName("王五");
		stu3.setColor("yellow color");
		
		Student stu4 = new Student();
		stu4.setId("004");
		stu4.setName("周六");
		stu4.setColor("black color");
		
		stuList.add(stu1);
		stuList.add(stu2);
		stuList.add(stu3);
		
		Student s = new Student();
		System.out.println(stuList);
		
		Iterator<Student> iter = stuList.iterator();
		while (iter.hasNext()) {
			s = iter.next();
			/*if (ConstantDemo.STUDENT_NAME.equals(s.getName())) {
				iter.remove();
			}*/
			
			if (ConstantEnum.STUDENT_ID_ZHANG.getId().equals(s.getId())) {
				iter.remove();
			} 
			
			if (ColorEnum.GREEN.getColor().equals(s.getColor())) {
				iter.remove();
			}
			
			if (NameEnum.NAME.getName().equals(s.getName())) {
				iter.remove();
			}
			
		}
		System.out.println(stuList);
		
	}
	
}

class Student {
	private String id;
	private String name;
	private String color;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", color=" + color + "]";
	}
	
}
