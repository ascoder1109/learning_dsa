import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchUsingBuiltInMethods {
    public static void main(String[] args) {
        int arr[] = {2,5,3,4,6};
        Arrays.sort(arr);
        int key = Arrays.binarySearch(arr, 4);
        System.out.println(key);
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(7);
        list.add(2);
        list.add(8);
        list.add(10);
        int index = Collections.binarySearch(list, 8);
        System.out.println(index);    
    }

}
