import java.util.*;
public class thirdMaximumNumber2 {
    public static void main(String[] args)
    {
        int[] nums={2,2,3,1};
        Set<Integer> set=new HashSet<>();
        for(int i:nums)
            set.add(i);

        int[] result=new int[set.size()];
        int index=0;
        for(int i:set)
            result[index++]=i;

        if(set.size()<3)
            System.out.println(result[result.length-1]);
        else {
            Arrays.sort(result);
            System.out.println(result[result.length - 3]);
        }
    }
}
