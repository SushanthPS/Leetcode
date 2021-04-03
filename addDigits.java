import java.util.*;
public class addDigits {
    public static void main(String[] args)
    {
        int n=38;
        int sum=0;
        while(n!=0)
        {
            sum+=n%10;
            n/=10;

            if(sum>9 && n==0) {
                n = sum;
                sum = 0;
            }
        }
        System.out.println(sum);
    }
}
