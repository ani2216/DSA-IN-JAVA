package string;

import java.util.*;

public class BalanceParanthesis {

	public static void main(String[] args) {
		Stack<Character> stack = new Stack<>();
		
		String s = "(())[{]";
		
		System.out.println(balanceParenthesis(stack,s));
		
	}
	
	public static boolean balanceParenthesis(Stack<Character> stack, String s) {
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
				stack.push(s.charAt(i));
			} else {
				if(!stack.isEmpty()) {
					if( (stack.peek() == '(' && s.charAt(i)==')') ||
							(stack.peek() == '{' && s.charAt(i) == '}') ||
							(stack.peek() == '[' && s.charAt(i) == ']')
					  ) {
						stack.pop();
					} else {
						return false;
					}
				}
			}
		}
		
		return stack.isEmpty();
	}

}
