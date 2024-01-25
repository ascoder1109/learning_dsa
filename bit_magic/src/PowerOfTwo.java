public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(8));
    }
    static boolean isPowerOfTwo(int n){
        long powerTwo = n & (n-1);
        return (powerTwo == 0);
    }
}
