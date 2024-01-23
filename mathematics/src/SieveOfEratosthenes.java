import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        sieve(30);
    }
    static void sieve(int n){
        ArrayList<Boolean> list = new ArrayList<>(Collections.nCopies(n+1,true));
        for(int i = 2; i<=Math.sqrt(n); i++){
            if (list.get(i)==true){
                for(int j = i * i ; j<=n ; j+=i){
                    list.set(j,false);
                }
            }
        }
            if (list.get(i)==true){
                System.out.println(i);
            }
        }
    }
}
