package questions;

public class MaxInstance {

	public static void main(String[] args) {
		int n = 5;
		int a[] = {7,0,5,1,11};
		int b[] = {1,2,1,3,4};
		
		int i=0;
		int totalPerson =0;
		int maxPerson = 0;
		
		while(i<n) {
			totalPerson +=a[i]-b[i];
			if(totalPerson >= maxPerson) {
				maxPerson=totalPerson;
			}
			
			i++;
		}
		
		System.out.println(maxPerson);
		
	}

}
