package string;

public class RotateString {

	public static void main(String[] args) {
		String s = "abcde"; //abcde
		String goal = "abced"; //adeac
		
		System.out.println(rotate(s,goal));
	}
	
	public static boolean rotate(String s, String goal) {
		

        if(s.length()!=goal.length()) return false;

        String temp = s+s;

        return temp.contains(goal);
	}

}
