public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        System.out.println(sum(6,0));
    }
    static int sum(int n, int result){
        if (n==0){
            return result;
        }
        else{
            return sum(n-1,result+n);
        }
    }
}
