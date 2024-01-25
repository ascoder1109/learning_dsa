public class TwoOddOccuringProgram {
    public static void main(String[] args) {
        int arr[] = {1,6,5,6,6,1};
        printTwoOdds(arr,arr.length);
    }
    static void printTwoOdds(int arr[], int n){
        int x = arr[0];
        for(int i = 1 ; i<n ; i++){
            x = x^arr[i];
        }
        int k = x & (~(x-1));
        int res1 = 0 , res2 = 0;
        for(int i = 1 ; i < n  ; i++){
            if ((arr[i]&k)!=0){
                res1 ^= arr[i];
            }
            else{
                res2 ^= arr[i];
            }
        }
        System.out.println(res1);
        System.out.println(res2);
    }
}
//Fixing required