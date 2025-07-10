package string;

public class LargestOddNumberInString {

	public static void main(String[] args) {
		
		String s = "0214638";
		
		System.out.println(largerString(s));
	}
	
	public static String largerString(String s) {
		int j = 0;
		int i = 0;
		int k =-1;
		while(j<s.length()) {
			if(s.charAt(i) == '0') {
				i++;
				continue;
			}
			
			int last = (int) s.charAt(j);
			
			if(last%2 != 0) {
				k = j;
			}
			
			j++;
		}
		
		if(k == -1) return "";
		return s.substring(i,k+1);
	}

}
