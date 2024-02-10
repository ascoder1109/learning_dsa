public class BinarySearchProgram {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        System.out.println(binarySearch(arr, arr.length, 4));
    }
    static int binarySearch(int arr[], int n, int element){
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if (arr[mid]==element) {
                return mid;
            }
            else if (arr[mid]>element) {
                high = mid - 1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }
}
