package day1;

public class StockbuyandSell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7,1,5,3,6,4};
		int res=Stockbuyandsell(arr);
		System.out.println(res);


	}

	private static int Stockbuyandsell(int[] arr) {
		// TODO Auto-generated method stub
		int mini=Integer.MAX_VALUE;
		int maxi=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			mini=Math.min(mini,arr[i]);
			maxi=Math.max(maxi, arr[i]-mini);
		}
		return maxi;
	}

}
