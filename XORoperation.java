import java.util.*;
public class XORoperation {
    public static void main(String[] args)
    {
        int n=10;
        int start=5;
        int sum=0;
        while(n-- > 0)
        {
            sum^=(start);
            start+=2;
        }
        System.out.println(sum);
    }
}
