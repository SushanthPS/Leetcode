import java.util.*;
public class isSubsequence {
    public static void main(String[] args)
    {
        String s="abc";
        String t="ahbgdc";
        int x=0;
        for(int i=0;i<t.length();i++)
        {
            if(s.charAt(x)==t.charAt(i))
                x++;
            if(x==s.length())
                System.out.println("true");
        }
        System.out.println("false");
    }
}
