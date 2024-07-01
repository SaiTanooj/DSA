package day1;

public class LongestSubarrayWithsumkPositives {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] ={-1, 1, 1};
		int k=1;
		int res=subarraysum(arr,k);
		System.out.println(res);
	}

	private static int subarraysum(int[] arr,int k) {
		// TODO Auto-generated method stub
		int i=0;
		int j=0;
		int sum=0;
		int maxi=0;
		while(j<arr.length) {
			sum=sum+arr[j];
			if(sum>k) {
				while(sum>k) {
					sum=sum-arr[i];
					i++;
				}
			}
			if(sum==k) {
				maxi=Math.max(maxi, j-i+1);
			}
			j++;
		}
		return maxi;
	}

}
