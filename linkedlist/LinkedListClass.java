package linkedlist;

import java.util.*;

public class LinkedListClass {
	
	public static void main(String[] agrs) {
		
		LinkedList<Integer> l1 = new LinkedList<>();
		
		LinkedList<Integer> l2 = new LinkedList<>();
		
		l1.add(2);
		l1.add(5);
		l1.add(6);
		
		l1.add(0,1);
		
		l1.forEach((n)->{System.out.print(n+" ");});
		System.out.println();
		System.out.println(l1.indexOf(2));
		System.out.println(l1.getLast());
		l1.set(l1.indexOf(5), 3);
		System.out.println(l1);
		l1.add(4);
		
		System.out.println(l1);
		
		l1.sort(null);
		System.out.println(l1);
		
		
	}
	
	

}
