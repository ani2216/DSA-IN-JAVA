package binarySearch;

public class FindElementWithX {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,5,5,5,6};
		
		System.out.println(find(arr,5));

	}
	
	public static int find(int[] arr, int x) {
		int left = findLeft(arr,x);
		if(left == -1) return 0;
		int right = findRight(arr,x);
		
		return right-left+1;
	}
	
	public static int findLeft(int[] arr, int x) {
		int count = -1;
		
		int start = 0, end = arr.length-1;
		
		while(start<=end) {
			int mid = start + (end-start+1)/2;
			
			if(arr[mid] == x) {
				count = mid;
				end = mid-1;
			} else if(arr[mid] > x) {
				end = mid-1;
			} else {
				start = mid+1;
			}
		}
		
		return count;
	}
	
	public static int findRight(int[] arr, int x) {
		int count = -1;
		
		int start = 0, end = arr.length-1;
		
		while(start<=end) {
			int mid = start + (end-start+1)/2;
			
			if(arr[mid] == x) {
				count = mid;
				start = mid+1;
			} else if(arr[mid] > x) {
				end = mid-1;
			} else {
				start = mid+1;
			}
		}
		
		return count;
	}

}
