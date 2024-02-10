public class CountOnesInArray {
    public static void main(String[] args) {
        int arr[] = {0,0,0,1,1,1,1,1};
        System.out.println(countOccurences(arr, arr.length, 1));
    }
    static int countOccurences(int arr[], int n, int x) {
        int first = firstOccurence(arr, n, x);
        if (first == -1) {
            return 0;
        }
        else{
            return(lastOccurence(arr, n, x)-first+1);
        }
    }

    static int firstOccurence(int arr[], int n, int x) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > x) {
                high = mid - 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                if (mid == 0 || arr[mid - 1] != arr[mid]) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    static int lastOccurence(int arr[], int n, int x) {
        int low = 0;
        int high = n - 1;
        int res = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > x) {
                high = mid - 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                res = mid;
                low = mid + 1;
            }
        }
        return res;
    }    
}
