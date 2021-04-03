import java.util.Arrays;

public class replaceAll_toAvoidConsecutiveRepeatingCharacter {
    public static void main(String[] args)
    {
        String s="?ayw?ipkj?";
        System.out.println(modifyString(s));
    }
    public static String modifyString(String s)
    {
        char rep;
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            rep='a';
            if(ch[i]=='?') {
                while ((i > 0 && ch[i - 1] == rep) || (i < ch.length - 1 && ch[i + 1] == rep))
                    rep++;
                ch[i] = rep;
            }

        }
        return String.valueOf(ch);
    }
}
