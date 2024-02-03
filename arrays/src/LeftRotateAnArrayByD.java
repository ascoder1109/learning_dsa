public class LeftRotateAnArrayByD {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        for(int i = 0 ; i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("After left rotation:");
        leftRotate(arr, arr.length, 3);
        for(int i = 0 ; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    static void leftRotate(int arr[], int n, int d){
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);
    }
    static void reverse(int arr[], int low, int high){
        while (low<high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
}
