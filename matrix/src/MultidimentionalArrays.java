/**
 * MultidimentionalArrays
 */
public class MultidimentionalArrays {

    public static void main(String[] args) {
        // int m= 2, n= 3;
        // int arr[] = new int[m][n]
        int arr[][] = {{1,2,3,4},{5,6,7}};
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}