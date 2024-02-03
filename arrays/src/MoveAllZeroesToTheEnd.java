public class MoveAllZeroesToTheEnd {
    public static void main(String[] args) {
        int arr[] = {10,4,5,0,0,9,2};
        int n = arr.length;
        for(int i = 0 ; i<n ;i++){
            System.out.println(arr[i]);
        }
        System.out.println("After moving all zeroes to the end:");
        moveZeroes(arr, n);
        for(int i = 0 ; i<n ;i++){
            System.out.println(arr[i]);
        }
    }
    static int moveZeroes(int arr[], int n){
        int count = 0;
        for(int i = 0 ; i<n ;i++){
            if (arr[i]!=0) {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count]=temp;
                count++;
            }
        }
        return count;
    }
}
