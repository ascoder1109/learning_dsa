public class RemoveDuplicatesInAnArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,3,4,5};
        int n = arr.length;
        for(int i = 0 ; i<n; i++){
            System.out.println(arr[i]);
        }
        n = removeDuplicates(arr,arr.length);
        System.out.println("After removing duplicates:");
        for(int i = 0 ; i<n; i++){
            System.out.println(arr[i]);
        }
    }
    static int removeDuplicates(int arr[], int n){
        int result = 1;
        for(int i = 1; i<n ;i++){
            if (arr[i]!=arr[result-1]){
                arr[result]=arr[i];
                result++;
            }
        }
        return result;
    }
}
