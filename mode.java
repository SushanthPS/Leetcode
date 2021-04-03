import java.util.*;
public class mode {
    public static void main(String[] args)
    {
        int[] nums={1,2,1,4,2,5,5,5};
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i:nums)
            map.put(i,map.getOrDefault(i,0)+1);

        int count=0;
        int ans=-1;

        for(int i:map.keySet())
        {
            if(map.get(i)>count)
            {
                count=map.get(i);
                ans=i;
            }
            else if(map.get(i)==count && i<ans)
                ans=i;

        }
        System.out.println("Count = "+count);
        System.out.println("Ans = "+ans);

    }
}
