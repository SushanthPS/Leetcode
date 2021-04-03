import java.util.*;
public class containsDuplicates {
    public static void main(String[] args)
    {
        int[] arr={1,2,3,1};
        Set<Integer> set=new HashSet<>();
        for(int i:arr)
        {
            if(set.contains(i))
            {
                System.out.println("Contains duplicates");
                break;
            }
            set.add(i);
        }
    }
}
