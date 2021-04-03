import java.util.*;
public class checkNandDouble {
    public static void main(String[] args)
    {
        int[] arr={7,1,14,11};
        Set<Integer> set=new HashSet<>(arr.length);
        for(int i:arr)
        {
            if(set.contains(i*2) || i%2==0 && set.contains(i/2))
                System.out.println("true");
            set.add(i);
        }
        System.out.println(set);
    }
}
