package binarySearch;

public class Findouthowmanytimesthearrayisrotated {

	public static void main(String[] args) {
		int arr[] = {1,2,3,0};
		
		System.out.println(find(arr));

	}
	
	public static int find(int[] arr) {
		int start = 0, end = arr.length-1;
		
		while(start<end) {
			int mid = start + (end-start)/2;
			
			if(arr[mid] > arr[end]) {
				start = mid+1;
			} else {
				end = start;
			}
		}
		
		return start;
	}

}
