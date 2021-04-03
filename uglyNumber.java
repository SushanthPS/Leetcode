import java.util.*;
public class uglyNumber {
    public static void main(String[] args)
    {
        int n=11;
        if(n<=0)
            System.out.println("false");

        while(n%2==0)
        {
            n /= 2;
        }
        while(n%3==0)
        {
            n /= 3;
        }
        while(n%5==0)
        {
            n /= 5;
        }

        if(n==1)
            System.out.println("true");
        else
            System.out.println("false");

    }
}

