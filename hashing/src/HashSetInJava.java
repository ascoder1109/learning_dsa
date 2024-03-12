import java.util.HashSet;

public class HashSetInJava {
    public static void main(String[] args) throws Exception {
        HashSet<String> h = new HashSet<>();
        h.add("gfg");
        h.add("courses");
        h.add("ide");
        System.out.println(h.size());
        h.remove("ide");
        System.out.println(h.size());
        for (String s:h){
            System.out.println(s + " ");
        }
        System.out.println(h.isEmpty());
    }
}
