public class LeadersInAnArray {
    public static void main(String[] args) {
        int arr[] = {7,10,4,10,6,5,2};
        int n =arr.length;
        for(int i = 0 ; i< n ; i++){
            System.out.println(arr[i]);
        }
        System.out.println("Leaders:");
        leader(arr, n);
    }
    static void leader(int arr[], int n){
        int currentLeader = arr[n-1];
        System.out.println(currentLeader);
        for(int i = n-2;i>=0;i--){
            if (currentLeader<arr[i]) {
                currentLeader=arr[i];
                System.err.println(currentLeader);
            }
        }
    }
}
