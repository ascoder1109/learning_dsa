public class MergeSortProgram {
    public static void main(String[] args) {
        int arr[] = {10,5,30,15,7};
        mergeSort(arr, 0, arr.length-1);
        for(int i = 0 ; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    static void mergeSort(int arr[], int l,  int r){
        if (l<r) {
            int m = l+(r-l)/2;
        mergeSort(arr, l, m);
        mergeSort(arr, m+1, r);
        merge(arr, l, m, r);    
        }
        
    }
    static void merge(int a[], int low, int mid, int high){
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

