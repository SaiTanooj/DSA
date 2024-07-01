package day1;
import java.util.*;
public class TwosumProblemHashing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 4, 45, 6, 10, 8};
		int n=arr.length;
		int target=16;
		boolean res=TwoSum(arr,n,target);
		System.out.println(res);

	}

	private static boolean TwoSum(int[] arr, int n, int target) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int moreNeeded = target - num;
            if (mpp.containsKey(moreNeeded)) {
                return true;
            }

            mpp.put(arr[i], i);
        }
        return false;
	}

}
