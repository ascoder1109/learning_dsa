public class CountDigitsProgram {
    public static void main(String[] args) {
        int x = 123456;
        System.out.println(countDigits(x));
    }
    static int countDigits(int n){
        int count = 0;
        while(n!=0){
            count++;
            n= n/10;
        }
        return count;
    }
}
