package sorting;

public class InsertionSort {

	public static void main(String[] agrs) {
		
		int arr[] = {4,77,1,90,34};
		
		
		sort(arr);
		
	}
	
	static void sort(int arr[]) {
		
		int n = arr.length;
		
		for(int i =0;i<n;i++) {
			
			int j = i-1;
			int key = arr[i];
			
			while(j>=0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		
		for(int i : arr) {
			System.out.print(i+" ");
		}
		
	}
	
}
