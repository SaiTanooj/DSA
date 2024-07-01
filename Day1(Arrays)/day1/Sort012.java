package day1;

public class Sort012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,0,2,1,1,0};
		sort012(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

	private static void sort012(int[] arr) {
		// TODO Auto-generated method stub
		int low=0;
		int mid=0;
		int high=arr.length-1;
		while(mid<=high) {
			if(arr[mid]==0) {
				int temp=arr[mid];
				arr[mid]=arr[low];
				arr[low]=temp;
				mid++;
				low++;
			}
			else if(arr[mid]==1) {
				mid++;
				

			
			}
			else {
				int temp=arr[mid];
				arr[mid]=arr[high];
				arr[high]=temp;
			    high--;
				
			}
		}
		
	}

}
