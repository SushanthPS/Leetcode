import java.util.*;
public class findTheDifference {
    public static void main(String[] args)
    {
        String s="abcd";
        String t="abcde";

        char ans=0;
        for(char x:s.toCharArray())
            ans^=x;
        for(char x:t.toCharArray())
            ans^=x;

        System.out.println(ans);
    }
}
