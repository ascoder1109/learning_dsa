public class LeftRotateByOne {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        for(int i = 0 ; i<n;i++){
            System.out.println(arr[i]);
        }
        leftRotate(arr, n);
        System.out.println("After left rotate:");
        for(int i = 0 ; i<n;i++){
            System.out.println(arr[i]);
        }
    }
    static void leftRotate(int arr[], int n){
        int temp = arr[0];
        for(int i = 1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
    }    
}
