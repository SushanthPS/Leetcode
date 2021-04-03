import java.util.Arrays;

public class checkIfTwoStringArraysAreEquivalent {
    public static void main(String[] args)
    {
        String[] word1 = {"abc", "d", "defg"};
        String[] word2 = {"abcddefg"};

        StringBuilder str1=new StringBuilder();
        StringBuilder str2=new StringBuilder();

        for(String s:word1)
            str1.append(s);

        for(String s:word2)
            str2.append(s);

        System.out.println(str1.toString().equals(str2.toString()));



    }
}
