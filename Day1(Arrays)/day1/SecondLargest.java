class Solution {
    int print2largest(int arr[], int n) {
        if(arr.length==1){
            return arr[0];
        }
        int largest=arr[0];
        int second_largest=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                
                second_largest=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>second_largest){
                second_largest=arr[i];
            }
            
        }
        return second_largest;
    }
}
