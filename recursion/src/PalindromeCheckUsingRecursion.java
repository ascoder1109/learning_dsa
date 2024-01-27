public class PalindromeCheckUsingRecursion {
    public static void main(String[] args) {
        System.out.println(isPalindrome("geeg",0));
    }
    static boolean isPalindrome(String str, int i){
        if (i> str.length()/2)
            return true;
        return str.charAt(i)==str.charAt(str.length()-i-1) && isPalindrome(str, i+1);
    }
}
