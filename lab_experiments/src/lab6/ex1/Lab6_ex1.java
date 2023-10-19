package lab6.ex1;

 

import java.util.ArrayList;

import java.util.Collections;

import java.util.Comparator;

import java.util.HashMap;

import java.util.List;

 

 

//Lab 6: Collection Framework

 

 

//Exercise 1: Create a method which accepts a hash map and

// return the values of the map in sorted order as a List.

 

public class Lab6_ex1 {

	public List<Object> getValues(HashMap<Object, Object> hashMap) {

		 if (hashMap == null) {

	            return null;

	        }

		 List<Object> values = new ArrayList<>(hashMap.values());

		 Collections.sort(values, new Comparator<Object>() {

	      

	            @SuppressWarnings("unchecked")

				public int compare(Object o1, Object o2) {

	                if (o1 instanceof Comparable && o2 instanceof Comparable) {

	                    return ((Comparable<Object>) o1).compareTo(o2);

	                }

	                return 0;

	            }

		 });

	     return values;

	}

	public static void main(String[] args) {

		Lab6_ex1 obj = new Lab6_ex1();

		HashMap<Object, Object> hashMap = new HashMap<>();

        hashMap.put("three", 3);

        hashMap.put("one", 1);

        hashMap.put("four", 4);

        hashMap.put("two", 2);

 

        List<Object> sortedValues = obj.getValues(hashMap);

 

        if (sortedValues == null) {

            System.out.println("Input HashMap is null.");

        } else {

            System.out.println("Sorted Values: " + sortedValues);

        }

 

	}

}