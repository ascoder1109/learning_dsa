public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,1,1,3,1,1,5};
        System.out.println(countConsecutiveOnes(arr,arr.length    -1));
    }
    static int countConsecutiveOnes(int arr[], int n){
        int count = 0;
        for(int i = 1 ; i<n ; i++){
            if (arr[i]==1 && arr[i-1]==1){
                count++;
            }
        }
        return count;
    }
}
