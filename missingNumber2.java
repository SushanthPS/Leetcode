import java.util.*;
public class missingNumber2 {
    public static void main(String[] args) {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int sum=0;
        for(int i:nums)
            sum+=i;
        int expectedSum=nums.length*(nums.length+1)/2;
        System.out.println(expectedSum-sum);
    }
}
