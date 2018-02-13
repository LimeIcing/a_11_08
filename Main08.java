import java.util.HashSet;
import java.util.Set;

public class Main08 {

    /*
    Write a method minLength that accepts a set of strings as a parameter and that returns the length of the shortest
    string in the list. If your method is passed an empty set, it should return 0 .
     */

    public static void main(String[] args) {
        HashSet<String> a = new HashSet<>();
        a.add("kat");
        a.add("maske");
        a.add("bord");
        a.add("fod");
        a.add("sky");
        a.add("blomst");
        a.add("banan");
        a.add("neglelak");
        System.out.println(minLength(a));
    }

    public static int minLength(Set<String> set) {
        int ans = -1;

        for (String string:set) {
            if (string.length() < ans || ans == -1) {
                ans = string.length();
            }
        }
        return ans;
    }
}
