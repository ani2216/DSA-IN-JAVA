package questions;

import java.util.*;

public class RotatingArray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int n = sc.nextInt();
		int a[]=new int[n];
		
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		
		int k = sc.nextInt();
		
		rotatingArray(a, k);
//		int b[] = new int[n];
//		
//		for(int i=0;i<n;i++) {
//			b[i] = a[i];
//		}
//		int count = 0;
//		
//		int j=1;
//		while((k>0 || count<n) && j<=(n-k)) {
//				
//			if(k>0) {
//			a[k-1]=b[n-count-1];
//			} else {
//				a[count]=b[j-1];
//				j++;
//			}
//			k--;
//			count++;
//		}
//		
//		for(int i:a) {
//			System.out.print(i+" ");
//		}
		
		
		sc.close();

	}
	
	private static void rotatingArray(int a[],int k) {
		
		int n = a.length;
		
		for(int i =0;i<n;i++) {
			if(k>0) {
				System.out.print(a[n-k]+" ");
				k--;
			} else {
				System.out.print(a[n-i-1]+" ");
			}
		}
	}

}
