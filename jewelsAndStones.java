import java.util.*;
public class jewelsAndStones {
    public static void main(String[] args)
    {
        String jewels="aA";
        String stones="aAAbbbb";
        System.out.println(numJewelsInStone(jewels,stones));
    }
    public static int numJewelsInStone(String jewels,String stones)
    {
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:stones.toCharArray())
            map.put(ch,map.getOrDefault(ch,0)+1);

        int sum=0;

        for(char ch:jewels.toCharArray())
            if(map.containsKey(ch))
                sum+=map.get(ch);

        return sum;
    }
}
