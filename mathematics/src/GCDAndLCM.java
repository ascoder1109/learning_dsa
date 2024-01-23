public class GCDAndLCM {
    public static void main(String[] args) {
        System.out.println(gcd(3,36));
        System.out.println(lcm(3,36));
    }
    static int gcd(int a, int b){
        if (b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    static int lcm(int a, int b){
        int lcm = (a*b)/gcd(a, b);
        return lcm;
    }
}
