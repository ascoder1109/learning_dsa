public class CountSetBitsProgram {
    public static void main(String[] args) {
        System.out.println(countSetBits(40));
    }
    public static int countSetBits(int n){
        int res = 0;
        while(n>0){
            n = n & (n-1);
            res++;
        }
        return res;
    }
}

//Brian Kerninghan algorithm