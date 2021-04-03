import java.util.*;
public class determineIfStringHalvesAreAlike {
    public static void main(String[] args)
    {
        String s="AbCdEfGh";
        System.out.println(halvesAreAlike(s));

    }
    public static boolean halvesAreAlike(String s)
    {
        int count=0;
        for(int i=0;i<s.length();i++)
            if(isVowel(s.charAt(i)))
                if(i<s.length()/2)
                    count++;
                else
                    count--;


        return count==0;

    }
    public static boolean isVowel(Character c)
    {
        c=Character.toLowerCase(c);
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
            return true;
        else
            return false;
    }
}
