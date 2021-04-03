import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class kidsWithGreatestNumberOfCandies {
    public static void main(String[] args)
    {
        int[] candies={12,1,12};
        int extraCandies=10;
        System.out.println(kidsWithCandies(candies,extraCandies));

    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies)
    {
        int max=0;
        List<Boolean> list=new ArrayList<>();

        for(int i:candies)
            if(i>max)
                max=i;

        for(int i:candies)
            if(i+extraCandies>=max)
                list.add(true);
            else
                list.add(false);

        return list;


    }
}
