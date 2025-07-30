package binarySearch;

public class Median {

	public static void main(String[] args) {
		int[] nums1 = {1,2};
		int[] nums2 = {3,4};
		
		System.out.println(findMedianSortedArrays(nums1,nums2));

	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length , n = nums2.length;
        int[] arr = new int[m+n];

        int i = 0,j=0,k=0;

        while(i<m && j<n){
            if(nums1[i] <= nums2[j]){
                arr[k++] = nums1[i++];
            } else{
                arr[k++] = nums2[j++];
            }
        }

        while(i<m){
            arr[k++] = nums1[i++];
        }

        while(j<n){
            arr[k++] = nums2[j++];
        }

        int len = arr.length;

        double res = 0;
        int idx = len/2;
        if(len%2 != 0){
            res = arr[idx];
        } else{
            double temp = arr[idx-1]+arr[idx];
            System.out.println(temp);
            res = temp/2;
        }
        
        System.out.println(arr.length);
        for(int ele : arr) {
        	System.out.println(ele);
        }

        return res;
    }
	
}
