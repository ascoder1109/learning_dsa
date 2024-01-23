public class PalindromeNumbersProgram {
    public static void main(String[] args) {
        System.out.println(isPalindrome(123212));
    }
    static boolean isPalindrome(int n){
        int reverse = 0;
        int temp = n;
        while (temp!=0){
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp = temp / 10;
        }
        return (reverse==n);
    }
}
