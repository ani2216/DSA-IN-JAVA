package string;

public class MaximumNestingDepthOfTheParentheses {

	public static void main(String[] args) {
		
		String s = "()(())((()()))";
		
		System.out.println(depth(s));

	}
	
	public static int depth(String s) {
		int count = 0;
		int max = 0;
		
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i) == '(') {
				count++;
			} else {
				if(s.charAt(i) == ')') {
					if(count > max) {
						max = count;
					}
					count--;
				}
			}
		}
		
		
		return max;
	}

}
