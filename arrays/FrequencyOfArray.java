package questions;

import java.util.*;

public class FrequencyOfArray {

	public static void main(String[] args) {
		
		int a[] = {1,2,1,3,4,5,5,2};
		
//		frequency(a);
		
//		nonRepeatingElement(a);
		
//		stringFrequency("abbaccadbe");
		
		frequencySort(a);
		
	}
	
//	private static void frequency(int a[]) {
//		Map<Integer,Integer> map = new HashMap<>();
//		
//		for(int i=0;i<a.length;i++) {
//			if(map.containsKey(a[i])) {
//				map.put(a[i], map.get(a[i])+1);
//			} else {
//				map.put(a[i], 1);
//			}
//		}
//		
//		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
//			System.out.println(entry.getKey()+" "+entry.getValue());
//		}
//		
//	}
	
//	private static void nonRepeatingElement(int a[]) {
//		Map<Integer,Integer> map = new HashMap<>();
//		
//		for(int i=0;i<a.length;i++) {
//			if(map.containsKey(a[i])) {
//				map.put(a[i], map.get(a[i])+1);
//			} else {
//				map.put(a[i], 1);
//			}
//		}
//		
//		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
//			
//			if(entry.getValue()==1) {
//				System.out.println(entry.getKey());
//			}
//		}
//	}
	
	private static void frequencySort(int a[]) {
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i=0;i<a.length;i++) {
			if(map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i])+1);
			} else {
				map.put(a[i], 1);
			}
		}
		
		List<Map.Entry<Integer, Integer>> list = new LinkedList<Map.Entry<Integer,Integer>>(map.entrySet());
		
		Collections.sort(list,new Comparator<Map.Entry<Integer, Integer>>() {

			@Override
			public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});
		
		HashMap<Integer,Integer> hm = new LinkedHashMap<>();
		for(Map.Entry<Integer, Integer> entry:list) {
			hm.put(entry.getKey(), entry.getValue());
		}
		
		for(Map.Entry<Integer, Integer> entry :hm.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
	}
	
//	private static void stringFrequency(String s) {
//		Map<String,Integer> map = new HashMap<>();
//		
//		for(int i=0;i<s.length();i++) {
//			
//			if(map.containsKey(String.valueOf(s.charAt(i)))) {
//			map.put(String.valueOf(s.charAt(i)), map.get(String.valueOf(s.charAt(i)))+1);
//			} else {
//				map.put(String.valueOf(s.charAt(i)),1);
//			}
//		}
//		
//		for(Map.Entry<String, Integer> entry: map.entrySet()) {
//			System.out.println(entry.getKey()+" "+entry.getValue());
//		}
//		
//	}

}
