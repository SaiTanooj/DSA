package day1;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int arr[] = {1,2,3,5};
		int res=findmissing(arr,n);
		System.out.println(res);

	}

	private static int findmissing(int[] arr, int n) {
		// TODO Auto-generated method stub
		
		 int sum=0;
	        for(int i=0;i<arr.length;i++){
	            sum=sum+arr[i];
	        }
	        return(((n*(n+1))/2)-sum);
	}

}
