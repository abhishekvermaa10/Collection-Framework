package com.scaleupindia.example3;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author abhishekvermaa10
 *
 */
public class Demo {
	public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap<>();
		hashMap.put(30, "Thirty");
		hashMap.put(80, "Eighty");
		hashMap.put(17, "Seventeen");
		hashMap.put(56, "Fifty Six");
		hashMap.put(34, "Thirty Four");
		hashMap.put(90, "Ninety");
		hashMap.put(2, "Two");
		hashMap.put(null, "a");
		hashMap.put(null, "b");
		System.out.println("Value of Hash Map is: " + hashMap);

		Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put(30, "Thirty");
		linkedHashMap.put(80, "Eighty");
		linkedHashMap.put(17, "Seventeen");
		linkedHashMap.put(56, "Fifty Six");
		linkedHashMap.put(34, "Thirty Four");
		linkedHashMap.put(90, "Ninety");
		linkedHashMap.put(2, "Two");
		linkedHashMap.put(null, "a");
		linkedHashMap.put(null, "b");
		System.out.println("Value of Linked Hash Map is: " + linkedHashMap);

		Map<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(30, "Thirty");
		treeMap.put(80, "Eighty");
		treeMap.put(17, "Seventeen");
		treeMap.put(56, "Fifty Six");
		treeMap.put(34, "Thirty Four");
		treeMap.put(90, "Ninety");
		treeMap.put(2, "Two");
		//treeMap.put(null, "a");
		//treeMap.put(null, "b");
		System.out.println("Value of Tree Map is: " + treeMap);

		Map<Integer, String> map4 = Map.of(30, "Thirty", 80, "Eighty", 17, "Seventeen");
		System.out.println("Value of map is: " + map4);
	}
}
