import java.util.*;
public class intersectionOfTwoArrays {
    public static void main(String[] args)
    {
        int[] nums1={4,9,5};
        int[] nums2={9,4,9,8,4};
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int num: nums1){
            set1.add(num);
        }

        for(int num: nums2){
            if(set1.contains(num)){
                set2.add(num);
            }
        }


        int[] result = new int[set2.size()];
        int index=0;
        for(int i:set2)
            result[index++]=i;

        System.out.println(set2);
    }
}
