import java.util.*;
public class singleNumberSets {
    public static void main(String[] args)
    {
        int[] nums={4,1,2,1,2};
        int unique=0;
        int num=0;
        Set<Integer> set=new HashSet<>();
        for(int i:nums)
        {
            if(!set.contains(i))
            {
                set.add(i);
                unique+=i;
            }
            num+=i;

        }
        System.out.println((2*unique)-num);

    }
}
