import java.util.*;
public class intersectionOfTwoArrays2 {
    public static void main(String[] args)
    {
        int[] nums1={2,2};
        int[] nums2={1,2,2,1};

        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();

        for(int i:nums1)
            map.put(i,map.getOrDefault(i,0)+1);

        for(int i:nums2)
            if(map.containsKey(i) && map.get(i)!=0)
            {
                list.add(i);
                map.put(i,map.get(i)-1);
            }

        int[] result=new int[list.size()];
        for(int i=0;i<list.size();i++)
            result[i]=list.get(i);


        System.out.println(list);

    }
}
