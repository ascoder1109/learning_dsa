public class MaximumInAnArray {
    public static void main(String[] args) {
        int arr[] = {4,5,6,9,7,5,8};
        System.out.println(max(arr,arr.length));
    }
    static int max(int arr[], int sizeOfArray){
        int max = arr[0];
        for(int i = 0 ; i < sizeOfArray-1 ; i++){
                if (arr[i]>max)
                    max = arr[i];
        }
        return max;
    }
}
