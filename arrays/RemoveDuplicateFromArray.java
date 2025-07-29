package questions;

import java.util.*;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,4,5,5,5,3,3,3,1,1,7,7,6,9,6,9};
		
		removeDuplicate(a);
	}
	
	private static void removeDuplicate(int a[])
	{
		int n = a.length;
		
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i=0;i<n;i++) {
			if(map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i])+1);
			} else {
				map.put(a[i], 1);
			}
		}
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.print(entry.getKey()+" ");
		}
		
		
	}

}
