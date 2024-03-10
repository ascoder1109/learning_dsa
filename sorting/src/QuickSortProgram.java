public class QuickSortProgram {
    public static void main(String[] args) {
        int arr[] = {3,4,2,1,6,4};
        quickSort(arr, 0, arr.length-1);
        for(int i = 0 ; i<arr.length ; i++){
            System.out.println(arr[i]);
        }
    }

    static int partition(int arr[], int lb, int ub) {
        int pivot = arr[lb];
        int start = lb;
        int end = ub;
        while (start < end) {
            
            while (arr[start] <= pivot) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }
            if (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }
        int temp = arr[lb];
        arr[lb] = arr[end];
        arr[end] = temp;
        return end;
    }
    static void quickSort(int arr[], int lb, int ub){
        if (lb<ub) {
            int loc = partition(arr, lb, ub);
            quickSort(arr, lb, loc-1);
            quickSort(arr, loc+1, ub);
        }
    }
}
