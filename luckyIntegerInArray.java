import java.util.*;
public class luckyIntegerInArray {
    public static void main(String[] args)
    {
        int[] arr={1,2,2,3,3,3};
        int[] count=new int[501];
        for(int i:arr)
            count[i]++;

        for(int i=500;i>0;i--)
            if(count[i]==i)
            {
                System.out.println(i);
                break;
            }

    }
}
