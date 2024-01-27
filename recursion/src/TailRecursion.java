public class TailRecursion {
    public static void main(String[] args) {
        System.out.println(factorialTailRecursion(6,1));
    }
    static int factorialTailRecursion(int n, int result){
        if (n<=1){
            return result;
        }
        else {
            return factorialTailRecursion(n-1,result*n);
        }
    }
}
