import java.util.*;
public class consecutiveCharacters {
    public static void main(String[] args)
    {
        String s="hooraaaaaaaaaaay";
        char point=s.charAt(0);
        int count=0;
        int max=0;

        for(char ch:s.toCharArray())
        {
            if(ch==point)
                count++;
            else
            {
                max=Math.max(max,count);
                point=ch;
                count=1;
            }
        }
        System.out.println(Math.max(max,count));
    }
}
