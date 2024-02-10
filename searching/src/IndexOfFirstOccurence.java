public class IndexOfFirstOccurence {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,4,4,5};
        System.out.println(firstOccurence(arr, arr.length, 4));
    }
    static int firstOccurence(int arr[], int n, int x){
        int low = 0 ;
        int high = n-1;
        int mid = (low + high)/2;
        if (arr[mid]>x) {
            high = mid - 1;
        }
        else if(arr[mid]<x){
            low =  mid +1;
        }
        else{
            if (mid == 0 || arr[mid-1]!=arr[mid]) {
                return mid;
            }
            else{
                return high = mid -1;
            }
        }
        return -1;
    }
}
