package string;

public class CountAndSay {

	public static void main(String[] args) {
		
		int n = 4;
		
		System.out.println(recursive(n));

	}
	
	public static String recursive(int n) {
		if(n==1) return "1";
		
		return rel(recursive(n-1));
	}
	
	public static String rel(String n){
		
		StringBuilder result = new StringBuilder();
		int count = 1;
		
		for(int i =1;i<n.length();i++) {
			if(n.charAt(i) == n.charAt(i-1)) {
				count++;
			} else {
				result.append(count).append(n.charAt(i-1));
				count = 1;
			}
		}
		
		result = result.append(count).append(n.charAt(n.length()-1));
		
		return result.toString();
		
	}

}
