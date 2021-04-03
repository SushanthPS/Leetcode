import java.util.*;
class removeElement {
    public static int removeElements(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }

        }
        return i;
    }
}
//2 pointer problem taken from leetCode
//shows how to remove a element without creating one more array
//it is done by shifting all non target elements to the left.