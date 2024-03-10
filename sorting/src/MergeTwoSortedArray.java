public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6};
        int b[] = {4,5,6,7,8,9,10};
        merge(a, b, a.length, b.length);
    }
    static void merge(int a[] , int b[], int m , int n){
        int i = 0 , j = 0;
        while (i<m && j<n) {
            if (a[i]<=b[j]) {
                System.out.println(a[i]);
                i++;
            }
            else{
                System.out.println(b[j]);
                j++;
            }
        }
        while (i<m) {
            System.out.println(a[i]);
            i++;
        }
        while (j<n) {
            System.out.println(b[j]);
            j++;
        }
    }
}