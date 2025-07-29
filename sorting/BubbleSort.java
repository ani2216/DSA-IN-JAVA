package sorting;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		int arr[] = {4,77,1,90,34};
		
		
		sort(arr);
	}
	
	static void sort(int arr[]) {
		
		int n = arr.length;
		
		for(int i =0;i<n;i++) {
			
			for(int j = 0;j<n-1;j++) {
				
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1] = temp;
				}
				
			}
		}
		
		for(int i : arr) {
			System.out.print(i+" ");
		}
		
	}

}
