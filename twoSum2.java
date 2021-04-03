import java.util.*;
public class twoSum2 {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        int left = 0;
        int right = numbers.length - 1;
        int sum = 0;

        while (left < right)
        {
            sum=numbers[left]+numbers[right];
            if(sum==target) {
                System.out.println(left + " " + right);
                break;
            }
            else if(sum<target)
                left++;
            else
                right--;

        }

    }
}
