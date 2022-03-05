package com.j2se.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ListExample {

	public static void main(String args[]) {

		new ListExample().arrayListExample();
	}

	public void arrayListExample() {

		List<String> s = new ArrayList<String>();
		s.add("kuldeep");
		s.add("Vikram");
		s.add("Mahima");
		s.add("Priayanshi");
		s.add("Shivani");
		s.add("Ankit");

		for (String obj : s) {

			System.out.println(s);

		}

		System.out.println("List size is " + s.size());
		System.out.println("Get value based on index " + s.get(1));
		s.add("Yahiya");
		s.add("Priyanshi");
		System.out.println("  array is " + s);

		// ADD ONE LIST TO ANOTHER LIST
		List<String> list1 = new ArrayList<String>();
		list1.add("Gazala Mam");
		list1.add("Sarit Mam");
		list1.add(null);
		s.addAll(list1);
		System.out.println("new array is " + s);
		//
		Iterator it = s.iterator();
		while (it.hasNext()) {

			System.out.println(it.next());
		}

		System.out.println("---------------------------------");
		System.out.println(s);
		s.remove(1);
		System.out.println(s);
		s.remove(null);
		System.out.println(s);
		s.removeAll(list1);
		System.out.println(s);
		// s.clear();
		System.out.println(s);
		System.out.println(s.contains("Priyanshi"));
		s.set(1, "depty");
		System.out.println(s);

		//

		for (String its : s) {

			s.set(5, "Ritika");
		}

		System.out.println(s);
	}

	public void decalarationType() {

		List<String> s = new ArrayList<String>(); // default capacity is 10

		List<String> s1 = new ArrayList<String>(50); // not set capacity is 20

		List<String> s3 = new ArrayList<String>(s1); // declare with collection

		Collection<String> s4 = new ArrayList<String>(); // create collection using Collection interface

	}

}
