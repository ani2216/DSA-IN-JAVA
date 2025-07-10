package string;
import java.util.*;
public class RemoveOuterParenthesis {

	public static void main(String[] args) {
		String s = "()[]{}(({}))";
		Stack<Character> stack = new Stack<>();
		
		System.out.println(removeBrackets(stack,s));
		
		
	}
	
	public static String removeBrackets(Stack<Character> stack, String s) {
		String new_s = "";
		int k =0,j=-1;
		for(int i =0;i<s.length();i++) {
			j++;
			if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
				stack.push(s.charAt(i));
			} else {
				if(!stack.isEmpty()) {
					if( (stack.peek() == '(' && s.charAt(i) == ')') ||
							(stack.peek() == '{' && s.charAt(i) == '}') ||
							(stack.peek() == '[' && s.charAt(i) == ']')
							) {
						stack.pop();
					}
					
					if(stack.isEmpty()) {
						if(j<s.length()) {
							new_s += s.substring(k+1, j);
							k = j+1;
							System.out.println(k+" "+j);
						} 
					}
				}
			}
		}
		
		
		return new_s;
	}
	
}
