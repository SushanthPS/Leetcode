import java.util.*;
public class singleNumberHash {
    public static void main(String[] args)
    {
        int[] num={1,4,2,2,1};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:num)
            map.put(i,map.getOrDefault(i,0)+1);

        for(int i:num)
            if(map.get(i)==1)
                System.out.println(i);

    }
}
