public class IndexOfLastOccurence {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 3, 4, 4, 4, 6 };
        System.out.println(lastOccurence(arr, 4, arr.length));
    }

    static int lastOccurence(int arr[], int element, int n) {
        int low = 0;
        int high = n - 1;
        int res = -1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] > element) {
                high = mid - 1;
            } else if (arr[mid] < element) {
                low = mid + 1;
            } else {
                res = mid;
                low = mid + 1; 
            }
        }
        return res;
    }
}
