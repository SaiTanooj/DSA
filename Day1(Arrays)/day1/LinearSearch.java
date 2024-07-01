package day1;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4};
		int res=linearsearch(arr,4);
		System.out.println(res);

	}

	private static int linearsearch(int[] arr, int k) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                return 1;
            }
        }
        return -1;
	}

}
