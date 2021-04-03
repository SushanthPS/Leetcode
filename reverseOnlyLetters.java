import java.util.*;
public class reverseOnlyLetters {
    public static void main(String[] args)
    {
        String S="a-bC-dEf-ghIj";
        Stack<Character> stack=new Stack<>();
        for(char c: S.toCharArray())
            if(Character.isLetter(c))
                stack.push(c);

        StringBuilder ans=new StringBuilder();
        for(char c:S.toCharArray())
            if(Character.isLetter(c))
                ans.append(stack.pop());
            else
                ans.append(c);

        System.out.println(ans.toString());

    }
}
