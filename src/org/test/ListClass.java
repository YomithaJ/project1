package org.test;

import java.util.LinkedList;
import java.util.List;

public class ListClass {
 
	public static void main(String[] args) {
	 
		//dissimilar type
		List li = new LinkedList();
		
		li.add(10);
		li.add(20l);
		li.add('3');
		li.add(40f);
		li.add("50");
		li.add(true);
		li.add(10);
		System.out.println(li);
		System.out.println("========================================");
//similar type
		List <Integer> l = new <Integer> LinkedList();
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		l.add(10);
	    System.out.println(l);
		System.out.println("========================================");
		
     List <Integer> s = new <Integer> LinkedList();
		
		s.add(30);
		s.add(20);
		s.add(50);
		s.add(70);
		s.add(45);
		s.add(80);
		s.add(90);
	    System.out.println(s);
		System.out.println("========================================");
		
		s.retainAll(l);
		System.out.println(s);
		System.out.println("========================================");
		
		s.removeAll(l);
		System.out.println(s);
		System.out.println("========================================");
		
		
		
		
		int size = l.size();
		System.out.println(size);
		System.out.println("========================================");
		
		Integer inte = l.get(3);
		System.out.println(inte);
		System.out.println("========================================");
		
		//l.add(3, 55);
		//System.out.println(l);
		//System.out.println("========================================");
		
		//Integer remove = l.remove(5);
		//System.out.println(remove);
		//System.out.println("========================================");
		
		//l.set(2,90);
		//System.out.println(l);
		//System.out.println("========================================");
		
		boolean contains = l.contains(30);
		System.out.println(contains);
		System.out.println("========================================");
		
		int indexOf = l.indexOf(60);
		System.out.println(indexOf);
        System.out.println("========================================");
		
		int lastIndexOf = l.lastIndexOf(10);
		System.out.println(lastIndexOf);
		System.out.println("========================================");
		
		boolean empty = l.isEmpty();
		System.out.println(empty);
		System.out.println("========================================");
		
		
		
		
		
		
		
		
		
		
	
}

}
