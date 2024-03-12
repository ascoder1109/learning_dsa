import java.util.HashMap;
import java.util.Map;

public class FrequencyOfArrayElements {
    public static void main(String[] args) {
        int arr[] = {50,50,10,40,10};
        frequency(arr, arr.length);       
    }
    static void frequency(int arr[], int n){
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i : arr){
            h.put(i, h.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer, Integer> e: h.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
