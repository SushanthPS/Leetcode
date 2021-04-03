public class find2MaxNumbers {
    public static void main(String[] args) {
        int[] nums = {10, 3, 4, 5, 2};
        int max1 = 0;
        int max2 = 0;
        for (int i : nums) {
            if (i >= max1) {
                max2 = max1;
                max1 = i;
            } else if (i > max2)
                max2 = i;

        }

        System.out.println(max1);
        System.out.println(max2);
    }
}
