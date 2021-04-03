import java.util.*;
public class occurrencesAfterBigram {
    public static void main(String[] args)
    {
        String first="a";
        String second="good";
        String text="alice is a good girl she is a good student";
        System.out.println(Arrays.toString(findOccurrences(text,second,first)));
    }
    public static String[] findOccurrences(String text,String second,String first)
    {
        String[] words=text.split(" ");
        List<String> list=new ArrayList<>();
        for(int i=0;i<words.length;i++)
            if(i<words.length-2 && words[i].equals(first) && words[i+1].equals(second))
                list.add(words[i+2]);



        return list.toArray(new String[0]);
    }
}
