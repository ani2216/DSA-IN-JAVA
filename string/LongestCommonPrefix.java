package string;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		
		String[] str = {"flower","flow","flight"};
		System.out.println(prefix(str));
	}
	
	public static String prefix(String[] str) {
		if (str == null || str.length == 0) return "";
		
		String temp = str[0];
		
		for(int i =1;i<str.length;i++) {
			
			int n = Math.min(temp.length(), str[i].length());
			int j = 0;
			while(j<n && (temp.charAt(j) == str[i].charAt(j))) {
				j++;
			}
			
			temp = temp.substring(0,j);
			
			if(temp.isEmpty()) break;
			
		}
		
		
		
		return temp;
	}

}
