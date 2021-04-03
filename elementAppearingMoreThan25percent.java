import java.util.*;
public class elementAppearingMoreThan25percent {
    public static void main(String[] args)
    {
        int[] arr={1,2,2,6,6,6,6,7,10};

        Map<Integer,Integer> map=new HashMap<>();

        for(int i:arr)
            map.put(i,map.getOrDefault(i,0)+1);

        int count=0;
        int ans=-1;

        for(int i:map.keySet())
            if(map.get(i)>count)
            {
                count=map.get(i);
                ans=i;
            }

        System.out.println(ans);



    }
}
