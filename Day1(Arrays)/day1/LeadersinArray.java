package day1;


import java.util.*;
public class LeadersinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] ={16,17,4,3,5,2};
		ArrayList res=leaders(arr);
		System.out.println(res);

	}

	private static ArrayList leaders(int[] arr) {
		// TODO Auto-generated method stub
		ArrayList<Integer>ans=new ArrayList<Integer>();
		ans.add(arr[arr.length-1]);
		for(int i=arr.length-2;i>=0;i--) {
			if(arr[i]>ans.get(ans.size()-1)) {
				ans.add(arr[i]);
			}
		}
		Collections.reverse(ans);
		return (ans) ;
	}

}
