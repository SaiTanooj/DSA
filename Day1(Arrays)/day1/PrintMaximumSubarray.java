package day1;
import java.util.*;
public class PrintMaximumSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] ={-1,-2,-3,-4};
		ArrayList res=kadane(arr);
		System.out.println(res);

	}

	private static ArrayList kadane(int[] arr) {
		// TODO Auto-generated method stub
		ArrayList<Integer>ans= new ArrayList<Integer>();
		int start=0;
		int end=-1;
		int ansstart=-1;
		int sum=0;
		int maxi=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(sum==0) {
				start=i;
			}
			sum=sum+arr[i];
			if(sum>maxi) {
				maxi=sum;
				ansstart=start;
				end=i;
			}
		}
		for(int j=ansstart;j<=end;j++) {
				ans.add(arr[j]);
		}
		return ans;
	}

}
