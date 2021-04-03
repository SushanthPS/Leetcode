import java.util.*;
public class missingNumber {
    public static void main(String[] args)
    {
        int[] nums={9,6,4,2,3,5,7,0,1};

        //0 1 2 3 4 5 6 7 9 => nums
        //0 1 2 3 4 5 6 7 8 => Index


        int missing=nums.length;
        for(int i=0;i<nums.length;i++)
            missing ^= i ^ nums[i];


        System.out.println(missing);
    }
}
