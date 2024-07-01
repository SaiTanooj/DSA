package day1;

public class Kadane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int arr[] ={-1,-2,-3,-4};
		int res=kadane(arr);
		System.out.println(res);

	}

	private static int kadane(int[] arr) {
		// TODO Auto-generated method stub
		int sum=0;
		int maxi=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			if(sum>maxi) {
				maxi=Math.max(sum,maxi);
			}
			if(sum<0) {
				sum=0;
			}
			
		}
		return maxi;
	}

}
