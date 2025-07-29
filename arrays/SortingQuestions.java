package questions;

public class SortingQuestions {

	public static void main(String[] args) {
		//merge sort
		
		int a[] = {12,31,25,8,32,17,40,42};
		
		mergesort(a, 0, a.length-1);
		print(a);
		
	}
	
	private static void mergesort(int a[], int l, int r) {
		
		if(l<r) {
		int mid = l+(r-l)/2;
		
		mergesort(a,l,mid);
		mergesort(a, mid+1, r);
		merge(a,l,mid,r);
		}
	}
	
	private static void merge(int a[],int l,int mid, int r) {
		int n1 = mid-l+1;
		int n2 = r-mid;
		
		int m=0,n=0,k=l;
		
		int leftSide[] = new int[n1];
		int rightSide[] = new int[n2];
		
		for(int i=0;i<n1;i++) {
			leftSide[i] = a[l+i];
		}
		
		for(int i=0;i<n2;i++) {
			rightSide[i] = a[mid+1+i];
		}
		
		while(m<n1 && n<n2) {
			if(leftSide[m] <= rightSide[n]) {
				a[k] = leftSide[m];
				m++;
			} else {
				a[k] = rightSide[n];
				n++;
			}
			k++;
		}
		
		while(m<n1) {
			a[k] = leftSide[m];
			m++;
			k++;
		}
		
		while(n<n2) {
			a[k] = rightSide[n];
			n++;
			k++;
		}
	
	}
	
	private static void print(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
