package sorting;

public class SelectionSort {
	
	public static void main(String[] args) {
		
		int arr[] = {4,77,1,90,34};
		
		sort(arr);
	}
	
	static void sort(int arr[]) {
		
int n = arr.length;
		
		for(int i =0;i<n;i++) {
			
			for(int j = i+1;j<n;j++) {
				
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j] = temp;
				}
				
			}
		}
		
		for(int i : arr) {
			System.out.print(i+" ");
		}
		
	}

}
