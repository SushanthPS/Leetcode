import java.util.*;
public class jewelsAndStones2 {
    public static void main(String[] args)
    {
        String jewels="aA";
        String stones="aAAbbbb";
        System.out.println(numJewelsInStone(jewels,stones));
    }
    public static int numJewelsInStone(String jewels,String stones)
    {
        int[] arr=new int[60];
        for(char ch:stones.toCharArray())
            arr[ch-'A']++;

        int sum=0;

        for(char ch:jewels.toCharArray())
            sum+=arr[ch-'A'];

        return sum;

    }
}