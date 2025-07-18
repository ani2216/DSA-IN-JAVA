package binarySearch;

import java.util.Arrays;

public class FirstandLastOccurrence {

	public static void main(String[] args) {
		int arr[] = {5, 7, 7, 8, 8, 10};
		
		int idx[] = index(arr,8);

		System.out.println(Arrays.toString(idx));

	}
	
	public static int[] index(int[] arr,int target) {
		int first = idxLeft(arr,target);
		int right = idxRight(arr,target);
		
		return new int[] {first,right};
		
	}
	
	public static int idxLeft(int[] arr,int target) {
		int idx = -1;
		
		int start = 0, end = arr.length-1;
		
		while(start<=end) {
			int mid = start + (end-start+1)/2;
			
			if(arr[mid] == target) {
				idx = mid;
				end = mid-1;
			} else if(arr[mid] > target) {
				end = mid-1;
			} else {
				start = mid+1;
			}
		}
		
		return idx;
	}
	
	public static int idxRight(int[] arr,int target) {
		int idx = -1;
		
		int start = 0, end = arr.length-1;
		
		while(start<=end) {
			int mid = start + (end-start+1)/2;
			
			if(arr[mid] == target) {
				idx = mid;
				start = mid+1;
			} else if(arr[mid] > target) {
				end = mid-1;
			} else {
				start = mid+1;
			}
		}
		
		return idx;
	}

}
