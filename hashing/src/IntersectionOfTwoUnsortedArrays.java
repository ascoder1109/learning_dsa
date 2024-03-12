import java.util.HashSet;

public class IntersectionOfTwoUnsortedArrays {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7};
        int  b[] = {3,4,5,6,7,8,9};
        intersection(a, b);
    }
    static void intersection(int a[], int b[]){
        HashSet<Integer> s = new HashSet<>();
        for(int i = 0; i<b.length; i++){
            s.add(b[i]);
        }
        for(int i = 0; i<a.length ; i++){
            if (s.contains(a[i])) {
                System.out.println(a[i]+" ");
            }
        }
    }
}
