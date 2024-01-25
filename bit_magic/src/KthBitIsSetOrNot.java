public class KthBitIsSetOrNot {
    public static void main(String[] args) {
        System.out.println(isKthBitSet(5,3));
    }
    static boolean isKthBitSet(int n, int k){
        int x = (1<<(k-1));
        return ((n&x)!=0);

    }
}
