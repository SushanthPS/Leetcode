import java.util.*;
public class perfectNumber {
    public static void main(String[] args)
    {
        int num=28;
        int sum=1;
        for(int i=2;i*i<=num;i++)
            if(num%i==0) {
                sum += i;
                if (i * i != num)
                    sum += (num / i);
            }

        if(num==sum)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
