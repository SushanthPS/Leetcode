import java.util.*;
public class distributeCandies {
    public static void main(String[] args)
    {
        int[] candyType={6,6,6,6};
        System.out.println(candies(candyType));
    }
    public static int candies(int[] candyType)
    {
        int n=candyType.length/2;
        Set<Integer> set=new HashSet<>();
        for(int i:candyType)
            set.add(i);

        if(set.size()>=n)
            return n;
        else
            return set.size();
    }
}
