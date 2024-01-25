public class FindOddOccuring {
    public static void main(String[] args) {
        int arr[] = {3,3,3,2,2,4,4,4,4};
        System.out.println(findOdd(arr, arr.length));
    }
    static int findOdd(int arr[], int n){
        int res = arr[0];
        for(int i = 1 ; i<n ; i++){
            res = res ^ arr[i];
        }
        return res;
    }
}
