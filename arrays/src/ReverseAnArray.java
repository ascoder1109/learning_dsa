public class ReverseAnArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        for(int i = 0 ; i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("Reverse the array:");
        int arrReverse[] = reverse(arr,arr.length);
        for(int i = 0 ; i<arrReverse.length;i++){
            System.out.println(arrReverse[i]);
        }
    }
    static int[] reverse(int arr[], int n){
        for(int i = 0 ; i<n/2 ; i++){
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1]=temp;
        }
        return arr;
    }
}
