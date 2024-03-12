import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoUnsortedArrays {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7};
        int  b[] = {3,4,5,6,7,8};
        System.out.println(union(a, b));
    }
    static int union(int a[], int b[]){
        Set<Integer> h = new HashSet<>();
        for( int i : a){
            h.add(i);
        }
        for(int i:b){
            h.add(i);
        }
        return h.size();
    }
}
