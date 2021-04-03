import java.util.*;
public class setMismatch {
    public static void main(String[] args)
    {
        int[] nums={1,1};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
    public static int[] findErrorNums(int[] nums)
    {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums)
            map.put(i,map.getOrDefault(i,0)+1);

        int missing=-1;
        int extra=-1;

        for(int i=1;i<=nums.length;i++)
            if(map.containsKey(i)) {
                if (map.get(i) == 2)
                    extra = i;
            }
            else
                missing=i;

        return new int[]{extra,missing};
    }
}
