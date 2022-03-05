package com.j2se.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class MapExample {

	/* there are 5 type hash */

	// hash map

	SortedMap<String, Object> sortedMap = new TreeMap<String, Object>();

	NavigableMap<String, String> s1 = new ConcurrentSkipListMap<String, String>();

	Map<String, String> m1 = new HashMap<String, String>();
	Map<String, String> m2 = new WeakHashMap<String, String>();
	Map<String, String> m3 = new IdentityHashMap<String, String>();
	HashMap<String, String> m4 = new LinkedHashMap<String, String>();

	public static void main(String args[]) {

		Map<String, Object> map = new HashMap<String, Object>();
		map.put(null, "Kuldeep");
		map.put("Name", "Kuldeep");
		map.put("Name", "Priyanshi");
		map.put("role", "developer");

		// convert into set

		Set<Map.Entry<String, Object>> set = map.entrySet();

		for (Map.Entry m : set) {

			System.out.println(m.getKey() + " and " + m.getValue());
		}

		Iterator<Map.Entry<String, Object>> it = set.iterator();
		while (it.hasNext()) {

			Map.Entry map1 = (Map.Entry) it.next();
			System.out.println(" " + map1.getKey() + " " + map1.getValue());
		}

		/// Way 2
		/*
		 * for (Map.Entry<String, Object> m : map.entrySet()) {
		 * System.out.println(m.getKey() + " and " + m.getValue());
		 * 
		 * }
		 */

		// way 3

		System.out.println(" using key set -------------------");
		for (String key : map.keySet()) {
			System.out.println(key);
		}

		for (String value : map.keySet()) {
			System.out.println(value);
		}

		// way 4 direct iterate

		Iterator<Map.Entry<String, Object>> itp = map.entrySet().iterator();
		while (itp.hasNext()) {
			Map.Entry<String, Object> mp = itp.next();
			System.out.println(mp.getKey() + " & " + mp.getValue());
		}

		// way 5

		map.forEach((k, v) -> System.out.println("Key = " + k + ", Value = " + v));

		for (String name : map.keySet()) {
			String url = (String) map.get(name);
			System.out.println(url + " = " + name);
		}

	}
}
