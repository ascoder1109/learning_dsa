public class GenerateSubsetsProgram {
    public static void main(String[] args) {
        generateSubsets("abc","",0);
    }
    static void generateSubsets(String s, String curr,int i){

        if (i==s.length()){
            System.out.println(curr);
            return;
        }
        generateSubsets(s,curr,i+1);
        generateSubsets(s,curr+s.charAt(i),i+1);
    }
}
