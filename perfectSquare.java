import java.util.*;
public class perfectSquare {
    public static void main(String[] args)
    {
        int num=808201;
        long low=0;
        long high=num/2;
        long mid;
        while(low<=high)
        {

            mid=low+(high-low)/2;
            System.out.println("mid="+mid);
            if(mid*mid==num)
            {
                System.out.println("true");
                break;
            }
            else if(mid*mid>num)
                high=mid-1;
            else
                low=mid+1;
        }
        System.out.println("false");
    }
}
