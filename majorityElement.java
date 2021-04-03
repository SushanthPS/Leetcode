import java.util.*;
public class majorityElement {
    public static void main(String[] args)
    {
        int[] num={3,3,4};
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int n:num)
        {
            if(!map.containsKey(n))
                map.put(n,1);
            else
                map.put(n, map.get(n)+1);
        }
        int ans=0,count=0;

        for(int n:map.keySet())
        {
            if(map.get(n)>count)
            {
                count=map.get(n);
                ans=n;
            }
        }
        System.out.println(ans);
    }
}
