public class DeleteAnElement {
    public static void main(String[] args) {
        int arr[] = {3,2,5,6,7,8};
        int sizeOfArray = arr.length;
        System.out.println("Before Insertion:");
        for(int i=0; i < sizeOfArray; i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("After Insertion:");
        sizeOfArray=deleteElement(arr,3,sizeOfArray);
        for(int i=0; i < sizeOfArray; i++)
        {
            System.out.println(arr[i]);
        }
    }
    static int deleteElement(int arr[], int position, int sizeOfArray){
        int index = position-1;
        if(index>sizeOfArray){
            return -1;
        }
        for(int i = index; i<sizeOfArray-1;i++){
            arr[i]=arr[i+1];
        }
        return sizeOfArray-1;
    }
    static void printArrays(int arr[], int sizeOfArray){
        for(int i = 0 ; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
