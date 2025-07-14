package string;

public class StringToIntegerAtoi {

	public static void main(String[] args) {
		String s = "0-1";
		
		System.out.println(atoi(s));

	}
	
	public static int atoi(String s) {
		int sign = 1,i=0;
		long count = 0;
		
		while(i<s.length() && s.charAt(i) == ' ') {
			i++;
		}
		
		if(i<s.length() && (s.charAt(i) == '-' || s.charAt(i)=='+')) {
			
			sign = s.charAt(i)=='-' ? -1 : 1;
			i++;
		}
		
		while(i<s.length() && Character.isDigit(s.charAt(i))) {
			
			count = count*10 + (s.charAt(i) - '0');
			
			if (sign * count <= Integer.MIN_VALUE) return Integer.MIN_VALUE;
			if(sign * count >= Integer.MAX_VALUE) return Integer.MAX_VALUE;
			
			i++;
		}
		
		return (int) (sign*count);
		
	}

}
