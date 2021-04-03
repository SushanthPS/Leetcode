import java.util.*;
public class palindrome {
    public static boolean isPalindrome(int num)
    {
        if(num==0)
            return true;
        if(num<0 || num%10==0)
            return false;
        int rev=0;
        while(num>rev)
        {
            rev=rev*10+num%10;
            num=num/10;
        }
        return rev==num || rev/10==num;
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        System.out.println(isPalindrome(num));
    }
}
