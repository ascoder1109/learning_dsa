public class FactorialOfANumber {
    public static void main(String[] args) {
        System.out.println(factorial(6));
    }
    static int factorial(int n){
        int fact = 1;
        for(int i = n ; i>0 ; i--){
            fact*=i;
        }
        return fact;
    }
}
