package recursion;

public class Powers {

	public static void main(String[] args) {
		double n = 2;
		int pow = -2;
		
		
		System.out.println(power(n,pow));
	}
	
	public static double power(double x,int n) {
	
	if(n < 0) {
		n = -n;
		x = 1/x;
	}
	
	double pow = 1;
	
	while(n!=0) {
		if((n&1) != 0) {
			pow *= x;
		}
		
		x *= x;
		
		n >>>=1;
	}
	
	return pow;
	
	
	}
}
