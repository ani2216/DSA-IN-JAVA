package binarySearch;

public class SearchinRotatedSortedArrayOne {

	public static void main(String[] args) {
		int arr[] = {4,5,6,7,0,1,2};
		
		System.out.println(find(arr,3));

	}
	
	public static int find(int[] arr,int target) {
		int start = 0, end = arr.length-1;
		
		while(start<=end) {
			int mid = start + (end - start+1)/2;
			
			if(arr[mid] == target) {
				return mid;
			} else if(arr[start] <= arr[mid]) {
				if(target >= arr[start] && target<=arr[mid]) {
					end = mid-1;
				}else {
					start = mid+1;
				}
			}else {
				if(target >= arr[mid] && target <= arr[end]) {
					start = mid+1;
				} else {
					end = mid-1;
				}
			}
		}
		
		return -1;
	}

}
