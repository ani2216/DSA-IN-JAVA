package string;
import java.util.*;

public class ValidAnagram {

	public static void main(String[] args) {
		String s = "dog";
		String t = "cat";
		
		System.out.println(validString(s,t));

	}
	
	public static boolean validString(String s, String t) {
		
		if(s.length()!=t.length()) return false;
		
		HashMap<Character,Integer> map1 = new HashMap<>();
		HashMap<Character,Integer> map2 = new HashMap<>();
	
		for(int i =0;i<s.length();i++) {
			map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0)+1);
			map2.put(t.charAt(i), map2.getOrDefault(t.charAt(i), 0)+1);
		}
		
		if(map1.equals(map2)) return true;
		
		return false;
		
	}

}
