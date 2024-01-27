public class RecursionPrintNumbers {
    public static void main(String[] args) {
        printNumbers(5);
    }
    static void printNumbers(int n){
        if (n==0){
            System.out.println(0);
        }
        else {
            System.out.println(n);
            printNumbers(n - 1);
        }
    }
}
