public class LeftRotateAnArrayByD {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        for(int i = 0 ; i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("After left rotation:");
        rotateArray(arr, arr.length, 3);
        for(int i = 0 ; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    static void rotateArray(int[] arr, int n, int k) {
        if (k == 0) {
            return;
        }
 
        // Rotate the array to the right by one position
        int temp = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
 
        // Recursively rotate the remaining elements k-1 times
        rotateArray(arr, n, k - 1);
    }
}
