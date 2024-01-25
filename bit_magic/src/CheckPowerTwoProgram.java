public class CheckPowerTwoProgram {
    public static void main(String[] args) {
        System.out.println(isPowerTwo(10));
    }
    static boolean isPowerTwo(int n){
        int powerTwo = (n&(n-1));
        return (powerTwo==0);
    }
}
