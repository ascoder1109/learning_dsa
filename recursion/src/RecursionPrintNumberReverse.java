public class RecursionPrintNumberReverse {
    public static void main(String[] args) {
        printNumbers(1,6);
    }
    static void printNumbers(int initial ,int last){
        if (initial==last){
            System.out.println(last);
        }
        else {
            System.out.println(initial);
            printNumbers(initial+1,last);
        }

    }
}
