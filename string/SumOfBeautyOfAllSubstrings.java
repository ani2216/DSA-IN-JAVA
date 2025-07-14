package string;

public class SumOfBeautyOfAllSubstrings {

	public static void main(String[] args) {
		
		String s = "aabcbaa";
		
		System.out.println(beautyOfSubStrings(s));

	}
	
	public static int beautyOfSubStrings(String s) {
		int totalBeauty = 0;

	    for (int i = 0; i < s.length(); i++) {
	        int[] freq = new int[26];

	        for (int j = i; j < s.length(); j++) {
	            char c = s.charAt(j);
	            freq[c - 'a']++;

	            int max = 0, min = Integer.MAX_VALUE;

	            for (int f : freq) {
	                if (f > 0) {
	                    max = Math.max(max, f);
	                    min = Math.min(min, f);
	                }
	            }

	            totalBeauty += (max - min);
	        }
	    }

	    return totalBeauty;
	}

}
