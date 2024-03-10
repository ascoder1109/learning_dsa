public class SlidingWindowTechnique {
    public static void main(String[] args) {
        //Find the maximum sum of k consecutive terms

    }
    static int maxSum(int arr[], int n, int k){
        int curr = 0;
        for(int i = 0; i<k; i++){
            curr+=arr[i];
        }
        int res = curr;
        for(int i = k ; i<n;i++){
            curr = curr+arr[i]-arr[i-k];
            res = Math.max(res,curr);
        }
        return  res;
    }
}
