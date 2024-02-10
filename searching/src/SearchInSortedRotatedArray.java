public class SearchInSortedRotatedArray {
    public static void main(String[] args) {
        int arr[] = {10,20,40,60,5,8};
        System.out.println(searchInRotatedArray(arr, arr.length, 5));
    }
    static int searchInRotatedArray(int arr[],int n, int x){
        int low =  0;
        int high = n -1;
        while(low<=high){
            int mid = (low + high) / 2;
            if (arr[mid]==x) {
                return mid;
            }
            if (arr[low]<= arr[mid]) {
                if (x>=arr[low] && x<arr[mid]) {
                    high = mid - 1;
                }
                else{
                    low = mid +1;
                }
            }
            else{
                if (x>arr[mid] && x<= arr[high]) {
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
