package string;

public class CountNumberOfSubstrings {

	static long modulo = 1000000007;
	public static void main(String[] args) {
		
		String s = "xy";
		System.out.println(substring(s));
	}
	
	public static int substring(String s) {
		long p = 0;
		long count = 0;
		
		int i =0,j=0;
		
		while(j<s.length()) {
			if(s.charAt(i) == s.charAt(j)) {
				p++;
				if(j == s.length()-1) {
					count += sum(p);
				}
				j++;
			} else {
				count += sum(p);
				p = 0;
				i++;
			}
		}
		
		return (int) (count % modulo);
	}
	
	public static long sum(long n) {
		
		return n*(n+1)/2;
	}

}
