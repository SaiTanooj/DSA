package day1;

import java.util.Arrays;

public class TwoSumusingTwoPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 4, 45, 6, 10, 8};
		int n=arr.length;
		int target=16;
		boolean res=TwoSum(arr,n,target);
		System.out.println(res);

	}

	private static boolean TwoSum(int[] arr, int n, int target) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			if(arr[low]+arr[high]==target) {
				return true;
			}
			else if(arr[low]+arr[high]<target) {
				low++;
			}
			else {
				high--;
			}
		}
		
		return false;
	}

}
