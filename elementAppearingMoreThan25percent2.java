import java.util.*;
public class elementAppearingMoreThan25percent2 {
    public static void main(String[] args)
    {
        int[] arr={1,2,2,6,6,6,6,7,10};

        int percent=arr.length/4;
        int last=arr[0];
        int count=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==last)
            {
                count++;
                if(count>percent) {
                    System.out.println(last);
                    break;
                }
            }
            else
            {
                last=arr[i];
                count=1;
            }
        }
        System.out.println(last);

    }
}
