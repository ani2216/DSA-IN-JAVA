package binarySearch;

public class SquareRoot {

	public static void main(String[] args) {
		double n = 24;
		
		System.out.println(sqrt(n));

	}
	
	public static double sqrt(double n) {
		double start = 0,end = n,mid = 0;
		
		double eps = 1e-5;
		
		while((end - start) > eps) {
			mid = (start+end)/2;
			
			if(mid*mid < n) {
				start = mid;
			} else {
				end = mid;
			}
		}
		
		
		return Math.round(mid*1e5)/1e5;
	}

}
