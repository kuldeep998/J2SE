package com.j2se.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> list = new LinkedList<String>();
		list.add("Kuldeep");
		list.add("Vikram");
		list.add("Kuldeep");
		list.add("Mahima");
		list.add("Priyanshi");
		list.add("Shivani");

		Iterator it = list.iterator(); // iteratator method from iterable interface
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(list);
		list.addFirst("Gazala Mam");
		list.addLast("SaritaMam");
		System.out.println(list);

		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.removeFirst());
		System.out.println(list);

		Object arr[] = list.toArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		// convert arr to list
		List<LinkedList<String>> arrayToList = Arrays.asList(list);
		System.out.println("----------------------- ");
		System.out.println(arrayToList);

		// using collection all method
		List<String> s = new LinkedList<String>();
		Collections.addAll(s, Arrays.toString(arr));
		System.out.println(s);

	}

}
