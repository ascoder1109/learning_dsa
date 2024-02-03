public class SecondLargestElementInAnArray {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,8,9,1,2,3};
        secondLargestElementInAnArray(arr,arr.length);
    }
    static void secondLargestElementInAnArray(int arr[], int n){
        int first,second;
        if (n<2){
            System.out.println("Invalid Input");
            return;
        }
        first=second=Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            if(arr[i]>first){
                second = first;
                first = arr[i];
            }
            else if(arr[i]>second && arr[i]!=first){
                second=arr[i];
            }
        }
        if (second==Integer.MIN_VALUE){
            System.out.println("There is no second largest element.");
        }
        else{
            System.out.println("The second largest element is:"+second);
        }

    }
}
