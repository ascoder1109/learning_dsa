public class BinarySearchRecursive {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        System.out.println(binarySearch(arr, 4, arr[0], arr[arr.length-1]));
    }
    static int binarySearch(int arr[], int element, int low, int high){
        int mid = (low + high)/2;
        if (arr[mid]==element) {
            return mid;
        }
        else if(arr[mid]>element){
            return binarySearch(arr, element, low, mid-1);
        }
        else if (arr[mid]<element) {
            return binarySearch(arr, element, mid+1, high);
        }
        return -1;
    }
}
