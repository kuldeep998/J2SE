package com.j2se.collection;

import java.util.ArrayList;
import java.util.List;

class DemoList implements Runnable {
	
	// ArrayList is not synchronized Example

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Student List invoked");
		List<String> studentList = new ArrayList<String>();
		studentList.add("Kuldeep");
		studentList.add("Priyanshi");
		studentList.add("Mahima");
		studentList.add("Vikram");
		for (String name : studentList) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println(name);
		}
	}

}

class DemoList2 implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Tearcher List invoked");
		List<String> teacherList = new ArrayList<String>();
		teacherList.add("Gazala");
		teacherList.add("Princy");
		teacherList.add("Sarita");
		teacherList.add("Jaya");
		for (String name : teacherList) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println(name);
		}
	}
}

public class ListThreadExample {

	public static void main(String[] args) {
		DemoList dt = new DemoList();
		DemoList2 dt2 = new DemoList2();
		Thread t = new Thread(dt);
		Thread t1 = new Thread(dt2);
		t.setName("Student Thread");
		t1.setName("Teacher Thread");
		t.start();
		t1.start();

		System.out.println("First Thread name " + t.getName());
		System.out.println("Second Thread name " + t.getName());

	}

}
