package day1;

public class Majority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,1,3,3,2};
		int res=findmajority(arr);
		System.out.println(res);

	}

	private static int findmajority(int[] arr) {
		// TODO Auto-generated method stub
		int j=arr[0];
		int count=1;
		int k=-1;
		for(int i=1;i<arr.length;i++) {
			if (count == 0) {
                count = 1;
                j = arr[i];
            } else if (j == arr[i]) count++;
            else count--;
		}
		if(count!=0) {
			k= j;
		}
		int countk=0;
		if(k!=-1) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==k) {
				countk++;
				
			}
		}
		}
		if(countk>(arr.length)/2) {
			return k;
		}
		return -1;
	}

}
