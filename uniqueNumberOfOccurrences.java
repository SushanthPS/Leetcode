import java.util.*;
public class uniqueNumberOfOccurrences {
    public static void main(String[] args)
    {
        int[] arr={1,2,2,1,1,3,3};

        Map<Integer,Integer> map=new HashMap<>();
        Set<Integer> set=new HashSet<>();

        for(int i:arr)
            map.put(i,map.getOrDefault(i,0)+1);

        for(int i:map.keySet())
            if(set.contains(map.get(i)))
                System.out.println("False");
            else
                set.add(map.get(i));

    }
}
