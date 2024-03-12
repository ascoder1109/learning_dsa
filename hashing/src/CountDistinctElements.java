import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

public class CountDistinctElements {
    public static void main(String[] args) {
        Integer arr[] = {10,20,10,20,30};
        System.out.println(countDistinct(arr, arr.length));
    }
    static int countDistinct(Integer arr[], int n){
        // HashSet<Integer> s = new HashSet<>();
        // for(int i = 0 ; i<arr.length;i++){
            //     s.add(arr[i]);
            // }
            // return s.size();
            
        HashSet<Integer> s = new HashSet<>(Arrays.asList(arr));
        return s.size();
    }
}
