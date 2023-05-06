package com.hackertest;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class LonelyInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList = Arrays.asList(1,2,7,3,4,5,3,2,1);
		Result4.lonelyinteger(intList);
		
		LinkedList<String> l1 = new LinkedList<String>();
		l1.add("Alice");
		l1.add("Mike");
		
		LinkedList<String> l2 = new LinkedList<String>();
		l2.add("Bob");
		l2.add("Lisa");
		l2.addAll(0,l1);
		l2.addLast("Bob");
		l2.remove("Bob");
		
		Iterator itr = l2.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}

class Result4 {
	
	public static int lonelyinteger(List<Integer> a) {
	    // Write your code here
		//Find duplicate elements from list using frequency
		
		//Map<Integer,Integer> map11 = a.stream().distinct().collect(Collectors.toMap(i -> a.get(i), i -> i));
		//List<Integer> uniArray = a.stream().distinct().collect(Collectors.toList());
		List<Integer> uniArray = a.stream().filter(i -> Collections.frequency(a, i) ==1)
        .collect(Collectors.toList());
		uniArray.stream().forEach(System.out::println);
		//System.out.println(uniArray.get(0));
		
		return uniArray.get(0);
	        
	}

}
