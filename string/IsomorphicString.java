package string;
import java.util.*;
public class IsomorphicString {

	public static void main(String[] args) {
		String s = "badc";
		String t = "baba";
		
		System.out.println(isomorphic(s,t));
	}
	
	public static boolean isomorphic(String s, String t) {
		
		if(s.length() == 0) return true;
		
		if(s.length() != t.length()) return false;
		
		HashMap<Character,Character> map1 = new HashMap<>();
		HashMap<Character,Character> map2 = new HashMap<>();
		
		for(int i =0;i<s.length();i++) {
			if(!map1.containsKey(s.charAt(i))) {
				map1.put(s.charAt(i),t.charAt(i));
			} else {
				if(map1.get(s.charAt(i)) != t.charAt(i)) return false;
			}
			
			if(!map2.containsKey(t.charAt(i))) {
				map2.put(t.charAt(i),s.charAt(i));
			} else {
				if(map2.get(t.charAt(i)) != s.charAt(i)) return false;
			}
				
		}
		
		
		return true;
		
	}

}
