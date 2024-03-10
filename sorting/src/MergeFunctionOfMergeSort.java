public class MergeFunctionOfMergeSort {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,1,2,4,6};
        mergeFunctionOfThisProgram(arr, 0, 3, arr.length-1);
        for(int i = 0 ; i<arr.length; i++){
            System.out.println(arr[i]);

        }
    }
    static void mergeFunctionOfThisProgram(int a[], int low, int mid, int high){
        int n1 = mid-low + 1;
        int n2 = high - mid;
        int left[] = new int[n1];
        int right[] = new int[n2];
        for(int i = 0; i<n1 ; i++){
            left[i] = a[low+i];
        }
        for(int i=0 ; i<n2 ; i++){
            right[i] = a[mid+i+1];
        }
        int i = 0, j=0, k = low;
        while (i<n1 && j<n2) {
            if (left[i]<=right[j]) {
                a[k] = left[i];
                i++;
                k++;
            }
            else{
                a[k]=right[j];
                k++;
                j++;
            }
        }
        while (i<n1) {
            a[k] = left[i] ;
            i++;
            k++;
        }
        while (j<n2) {
            a[k]=right[j];
            j++;
            k++;
        }
    }    
}
