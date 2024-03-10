public class PrefixSum {
    public static void main(String[] args) {
        int arr[] = {2,8,3,9,6,5,4};
        int n = 7;
        int ps[] = new int[n];
        ps[0] = arr[0];
        for(int i = 1; i<n;i++)
            ps[i]=ps[i-1]+arr[i];
    }
    static int getSum(int l, int r, int ps[]){
        if(l==0)
            return ps[r];
        return ps[r]-ps[l-1];
    }
}