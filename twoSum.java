import java.util.*;
public class twoSum {
    public static void main(String[] args) {
        int target = 9;
        int[] num = {2, 7, 11, 15};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < num.length; i++)
        {
            int complement = target - num[i];
            if (map.containsKey(complement))
            {
                System.out.println(i + " " + map.get(complement));
                break;
            }
            map.put(num[i], i);

        }
    }
}

