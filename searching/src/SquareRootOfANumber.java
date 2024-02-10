public class SquareRootOfANumber {
    public static void main(String[] args) {
        System.out.println(squareRoot(10));
    }
    static int squareRoot(int x){
        int low = 1;
        int high = x;
        int ans = -1;
        while (low<=high) {
            int mid = (low + high)/2;
            int middleSquareRoot = mid * mid;
            if (middleSquareRoot==x) {
                return mid;
            }
            else if(middleSquareRoot>x){
                high = mid -1;
            }
            else{
                low = mid+1;
                ans = mid;
            }
        }
        return ans;
    }
}
