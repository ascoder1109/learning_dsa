import java.util.ArrayList;
import java.util.List;

public class DivisorsOfANumber {
    public static void main(String[] args) {
        printDivisors(52);
    }
    static void printDivisors(int n){
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i<=Math.sqrt(n); i++){
            if(n%i==0){
                System.out.println(i);
            }
            else{
                list.add(n/i);
            }
        }
        for (int i = list.size() - 1 ; i>=0 ; i--){
            System.out.println(list.get(i));
        }
    }
}
