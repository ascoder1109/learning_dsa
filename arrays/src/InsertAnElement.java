public class InsertAnElement {
    public static void main(String args[]) 
    { 
       int arr[] = new int[5], cap = 5, n = 3;

       arr[0] = 5; arr[1] = 10; arr[2] = 20;

       System.out.println("Before Insertion");

       for(int i=0; i < n; i++)
       {
       		System.out.print(arr[i]+" ");
       }

       System.out.println();

       int x = 7, pos = 2;

       n = insert(arr, n, x, cap, pos);

       System.out.println("After Insertion");

       for(int i=0; i < n; i++)
       {
       		System.out.print(arr[i]+" ");
       }
    } 
    static int insert(int arr[], int sizeOfArray, int element, int maxCapacity, int position){
        if (sizeOfArray==maxCapacity){
            return sizeOfArray;
        }
        int index = position -1 ;
        for(int i = sizeOfArray-1;i>index;i--){
            arr[i+1]=arr[i];
        }
        arr[index]=element;
        return sizeOfArray+1;
    }


}
