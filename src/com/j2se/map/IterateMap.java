package com.j2se.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IterateMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("Name", "Kuldeep");
		map.put("Email", "kuldeep@gmail.com");
		map.put("work", "developer");
		new IterateMap().entrySetExample(map);
		new IterateMap().iteratorExample(map);
		new IterateMap().keySetExample(map);

		new IterateMap().keySetExaple(map);
		new IterateMap().forEachLoop(map);

	}

	private void keySetExaple(Map<String, Object> map) {
		for (String key : map.keySet()) {
			Object value = map.get(key);
			System.out.println(key + " = " + value);
		}

	}

	private void entrySetExample(Map<String, Object> map) {
		System.out.println("----------------entrySet() Example -----------------");
		Set<Map.Entry<String, Object>> set = map.entrySet();
		for (Map.Entry<String, Object> mp : set) {
			System.out.println(mp.getKey() + " = " + mp.getValue());
		}

	}

	public void iteratorExample(Map<String, Object> map) {
		System.out.println("----------------Iterator Example -----------------");
		Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> mp = it.next();
			System.out.println(mp.getKey() + " = " + mp.getValue());
		}
	}

	public void keySetExample(Map<String, Object> map) {
		for (String key : map.keySet()) {
			System.out.println("Key is" + key);
		}

		for (Object value : map.values())
			System.out.println("value: " + value);
	}

	public void forEachLoop(Map<String, Object> map) {

		map.forEach((k, v) -> System.out.println("key is" + k + " and  value is" + v));
	}

}
