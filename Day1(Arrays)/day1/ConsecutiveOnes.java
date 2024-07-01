package day1;

public class ConsecutiveOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1};
		int res=countones(arr);
		System.out.println(res);

	}

	private static int countones(int[] arr) {
		// TODO Auto-generated method stub
		int count=0;
		int maxi=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==1) {
				count++;
				maxi=Math.max(count,maxi);
			}
			else {
				count=0;
			}
		}
		return maxi;
	}

}
