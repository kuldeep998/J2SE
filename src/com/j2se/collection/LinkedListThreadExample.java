package com.j2se.collection;

import java.util.LinkedList;

class ThreadD extends Thread {

	@Override
	public void run() {
		
		
		print();
	}

	void print() {

		LinkedList<String> list = new LinkedList<String>();
		list.add("Kuldeep");
		list.add("Priyanshi");
		list.add("Priyanshi");
		list.add("Priyanshi");
		list.add("Priyanshi");
		list.add("Priyanshi");
		list.add("Priyanshi");
		list.add("Priyanshi");
		list.add("Priyanshi");
		list.add("Priyanshi");
		list.add("Priyanshi");
		list.add("Priyanshi");
		list.add("Priyanshi");
		list.add("Priyanshi");
		list.add("Priyanshi");

		list.addFirst("------ Student List --------------");
		list.addLast("---------- End ------------------");

		for (String s : list) {

			System.out.println(s);
		}
	}

}

class ThreadD2 extends Thread {
	@Override
	public void run() {
		print();
	}

	public void print() {

		/* synchronized (this) { */
		LinkedList<String> list = new LinkedList<String>();
		list.add("Gazala");
		list.add("Sharita");
		list.add("Sharita");
		list.add("Sharita");
		list.add("Sharita");
		list.add("Sharita");
		list.add("Sharita");
		list.add("Sharita");
		list.add("Sharita");
		list.add("Sharita");
		list.add("Sharita");
		list.addFirst("------ Teacher List --------------");
		list.addLast("---------- End ------------------");

		for (String s : list) {

			System.out.println(s);
		}
	}

	// }
}

public class LinkedListThreadExample {

	public static void main(String[] args) {
		ThreadD2 t2 = new ThreadD2();
		ThreadD t1 = new ThreadD();
		t2.setName("Teacher");
		t2.start();
		t1.setName("Student");
		t1.start();
		// t1.setPriority(Thread.MAX_PRIORITY);

		System.out.println(" Current thread name is " + t2.getName());
		System.out.println(" Current thread name is " + t1.getName());

	}

}
