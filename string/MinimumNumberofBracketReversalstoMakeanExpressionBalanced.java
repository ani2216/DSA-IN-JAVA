package string;

public class MinimumNumberofBracketReversalstoMakeanExpressionBalanced {

	public static void main(String[] args) {
		
		String s = ")))(((";
		
		System.out.println(rev(s));

	}
	
	public static int rev(String s) {
		
		s = s.replaceAll(" ", "");
		
		if(s.length()%2 != 0) return -1;
		
		int open = 0, close = 0;
		
		for(char c : s.toCharArray()) {
			if(c == '(') {
				open++;
			} else {
				if(open > 0) {
					open--;
				} else {
					close++;
				}
			}
		}
		
		return (open+1)/2 + (close+1)/2;
	}

}
