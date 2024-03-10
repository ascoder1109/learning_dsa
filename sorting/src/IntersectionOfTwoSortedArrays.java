public class IntersectionOfTwoSortedArrays {
    public static void main(String[] args) {
        int a[] = {1,2,3,3,3,4,4,5};
        int b[] = {3,4,5,5,6};
        int n = a.length;
        int m = b.length;
        intersection(a, b, n, m);
    }
    static void intersection(int a[], int b[] , int n, int m){
        int i = 0, j = 0;
        while (i<m && j<n) {
            if (i>0 && a[i]==a[i-1]) {
                i++;
                continue;
            }
            if (a[i] < b[j]) {
                i++;
            }
            else if (a[i]>b[j]) {
                j++;
            }
            else if(a[i]==b[j]){
                System.out.println(a[i]);
                i++;
                j++;
            }
        }
    }
}
