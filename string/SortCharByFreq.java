package string;
import java.util.*;
public class SortCharByFreq {

	public static void main(String[] args) {
		String s = "tree";
		
		System.out.println(freq(s));
	}
	
	public static String freq(String s){
		HashMap<Character,Integer> map = new HashMap<>();
//		List<Character> list = new ArrayList<>();
		
		String temp = "";
		
		for(int i = 0;i<s.length();i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
		}
		
		List<Map.Entry<Character, Integer>> list1 = new ArrayList<>(map.entrySet());
		
		Collections.sort(list1,(a,b) -> b.getValue().compareTo(a.getValue()));
		
		for(Map.Entry<Character, Integer> entry : list1) {
			
			for(int i=0;i<entry.getValue();i++) {
				temp += entry.getKey();
			}
		}
		
		return temp;
		
	} 

}
