import java.util.*;
public class boyerMooreVotingAlgorithm {
    public static void main(String[] args)
    {
        int[] nums={5,7,5,1,5,7,5,5,7,7,5,3,5,1,5,2,5,7,7,5,5,7};
        int count=0;
        int candidate=0;

        for(int num:nums)
        {
            if(count==0)
                candidate=num;
            count+=(candidate==num)?1:-1;
        }
        System.out.println(candidate);
    }
}
