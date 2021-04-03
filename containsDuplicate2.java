import java.util.*;
public class containsDuplicate2 {
    public static void main(String[] args)
    {
        int[] nums={1,2,3,1};
        int k=3;

        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++)
            if(map.containsKey(nums[i]) && i-map.get(nums[i])<=k)
                System.out.println("True");
            else
                map.put(nums[i],i);


    }
}
