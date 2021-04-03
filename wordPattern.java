import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class wordPattern {
    public static void main(String[] args)
    {
        String pattern="abba";
        String s="dog fish fish dog";
        System.out.println(wordPatterns(pattern,s));
    }
    public static boolean wordPatterns(String pattern,String s)
    {
        char[] ch=pattern.toCharArray();
        String[] words=s.split(" ");

        Map<Character,String> mapChar=new HashMap<>();
        Map<String,Character> mapWord=new HashMap<>();

        for(int i=0;i<words.length;i++)
        {
            char c=ch[i];
            String w=words[i];
            if(!mapChar.containsKey(c))
            {
                if(mapWord.containsKey(w))
                    return false;
                else
                {
                    mapChar.put(c,w);
                    mapWord.put(w,c);
                }
            }
            else
            {
                if(!mapChar.get(c).equals(w))
                    return false;
            }
        }
        return true;


    }
}
