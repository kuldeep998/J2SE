package com.j2se.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> set = new HashSet<String>();
		set.add("Kuldeep");
		set.add("kuldeep");
		set.add("Kuldeep");
		System.out.println(set);

		HashSet<String> s = (HashSet<String>) set;
		System.out.println(s);
		s.add("Priaynshi");
		s.add("Shivani");
		s.add("Mahima");
		System.out.println(s);

		Set<String> slink = new LinkedHashSet<String>(s);
		System.out.println(slink);
		// when we pass hashset reference in linkedhash set it not maintain insertion orer
		

		Set<String> sLink = new LinkedHashSet<String>();
		sLink.add("Priaynshi");
		sLink.add("Shivani");
		sLink.add("Mahima");
		System.out.println(sLink);

		// insertion order not managaed
	}

}
