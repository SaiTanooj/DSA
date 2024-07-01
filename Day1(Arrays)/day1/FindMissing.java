package day1;

public class FindMissing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 1, 2, 5, 5};
		int res=findmissing(arr);
		System.out.println(res);

	}

	private static int findmissing(int[] arr) {
		// TODO Auto-generated method stub
		
		int res=arr[0];
        for(int i=1;i<arr.length;i++){
            res=res^arr[i];
        }
        return res;
	}

}
