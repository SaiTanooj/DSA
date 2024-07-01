package day1;

public class MoveAllZeroestoend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,1,0,3,1,2};
		movezeroestoend(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}
	static void movezeroestoend(int a[]) {
		int j = -1;
        //place the pointer j:
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                j = i;
                break;
            }
        }

        //no non-zero elements:
        if (j == -1)return ;

        //Move the pointers i and j
        //and swap accordingly:
        for (int i = j + 1; i < a.length; i++) {
            if (a[i] != 0) {
                //swap a[i] & a[j]:
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
                j++;
            }
        }
	

}
}