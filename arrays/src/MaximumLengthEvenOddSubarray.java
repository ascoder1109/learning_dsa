public class MaximumLengthEvenOddSubarray {
    public static void main(String[] args) {
        int arr[] = {5,10,20,6,3,8};
        System.out.println(maxEvenOddCount(arr,arr.length));
    }
    static int maxEvenOddCount(int arr[], int n){
        int current = 1;
        int result = 1;
        for(int i = 1 ; i<n; i++){
            if((arr[i]%2==0 && arr[i-1]%2!=0) || (arr[i]%2!=0 && arr[i-1]==0)){
                current++;
                result=Math.max(result,current);
            }
            else{
                current=1;
            }

        }
        return result;
    }
}
