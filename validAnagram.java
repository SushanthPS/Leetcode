import java.util.*;
public class validAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        char[] sa = s.toCharArray();
        char[] ta = t.toCharArray();

        Arrays.sort(sa);
        Arrays.sort(ta);

        System.out.println(Arrays.equals(sa, ta));
    }
}