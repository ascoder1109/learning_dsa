public class SelectionSortProgram {
    public static void main(String[] args) {
        int arr[] = {1,3,2,4,6,3};
        int n = arr.length;
        for(int i = 0 ; i<n ; i++){
            System.out.println(arr[i]);
        }
        System.out.println("After Selection sort:");
        selectionSort(arr, n);
        for(int i = 0 ; i<n; i++){
            System.out.println(arr[i]);

        }
    }
    static void selectionSort(int arr[], int n){
        for(int i = 0 ; i<n-1 ; i++){
            int currentMinimum = i;
            for(int j = i+1 ; j<n ; j++){
                if (arr[j]<arr[currentMinimum]) {
                    currentMinimum = j;
                }
               
            }
            int temp = arr[currentMinimum];
            arr[currentMinimum] = arr[i];
            arr[i] = temp;
        }
    }
}
