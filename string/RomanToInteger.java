package string;

import java.util.*;

public class RomanToInteger {

	public static void main(String[] args) {
		
		String s = "MDCXCV";
	
		System.out.println(roman(s));
	}
	
	public static int roman(String s) {
		HashMap<Character,Integer> map = new HashMap<>();
		
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C',100);
		map.put('D', 500);
		map.put('M', 1000);
		
		int count = 0;
		
		int i =0;
		
		while(i<s.length()) {
			if(i< s.length()-1 && map.get(s.charAt(i)) < map.get(s.charAt(i+1))) {
				count += map.get(s.charAt(i+1)) - map.get(s.charAt(i));
				i+=2;
			} else {
				count += map.get(s.charAt(i));
				i++;
			}
		}
		
		return count;
	}
	

}
