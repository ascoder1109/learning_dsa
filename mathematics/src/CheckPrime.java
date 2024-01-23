public class CheckPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(14));
    }
    static boolean isPrime(int n){
        if (n == 0 || n==1){
            return false;
        }
        else if (n == 2 || n == 3){
            return true;
        }
        else if( n%2==0 || n%3 == 0){
            return false;
        }
        else {
            for(int i = 5 ; i<=Math.sqrt(n) ; i=i+6){
                if (n%i==0 || n%(i+2)==0){
                    return false;
                }
            }
        }
        return true;
    }
}
