public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {4,2,6,7,3,2};
        System.out.println(linearSearch(arr,arr.length,7));
    }
    static int linearSearch(int arr[], int n, int element){

        for(int i = 0 ; i<n ; i++){
            if (arr[i]==element){
                return i;
            }
        }
        return -1;
    }
}
