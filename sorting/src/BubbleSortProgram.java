public class BubbleSortProgram {
    public static void main(String[] args) {
        int arr[] = {1,3,2,4,6,3};
        int n = arr.length;
        for(int i = 0 ; i<n ; i++){
            System.out.println(arr[i]);
        }
        System.out.println("After bubble sort:");
        bubbleSort(arr, n);
        for(int i = 0 ; i<n; i++){
            System.out.println(arr[i]);

        }
    }
    static void bubbleSort(int arr[], int n){
        for(int i = 0 ; i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}

//Time Complexity: O(n^2)