import java.util.*;
public class reverseVowelsOfString {
    public static void main(String[] args)
    {
        String m="leetcode";
        char[] s=m.toCharArray();
        char temp;
        int a=0;
        int b=s.length-1;
        while(a<b) {
            while (!isVowel(s[a]))
            {
                a++;
                if(a>=m.length())
                    break;
            }

            while (!isVowel(s[b]) && b>=0)
            {
                b--;
                if(b<0)
                    break;
            }

            if (a < b) {
                temp = s[b];
                s[b] = s[a];
                s[a] = temp;
                a++;
                b--;

            }
        }
        System.out.println(String.valueOf(s));

    }
    public static boolean isVowel(char c)
    {
        c=Character.toLowerCase(c);
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
            return true;
        return false;
    }

}
