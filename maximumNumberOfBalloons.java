import java.util.*;
public class maximumNumberOfBalloons {
    public static void main(String[] args)
    {
        String text="loonbalxballpoon";
        System.out.println(maxNumberOfBalloons(text));
    }
    public static int maxNumberOfBalloons(String text)
    {
        int[] map=new int[128];
        for(char c:text.toCharArray())
            map[c]++;

        String temp="balloon";
        int min=text.length();
        for(char c:temp.toCharArray())
            if(c=='o' || c=='l')
                min=Math.min(min,map[c]/2);
            else
                min=Math.min(min,map[c]);
        return min;

    }
}
