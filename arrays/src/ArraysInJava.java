public class ArraysInJava {
    public static void main(String[] args) {
        int arr[] = new int[6];
        for(int i = 0 ; i<arr.length; i++){
            arr[i] = i;
        }
        for(int i = 0 ; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
