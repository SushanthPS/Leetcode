import java.util.*;
public class richestCustomerWealth {
    public static void main(String[] args)
    {
        int[][] accounts={{1,5},{7,3},{3,5}};
        System.out.println(maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts)
    {
        int maxWealth=0;
        int sum=0;
        for(int i=0;i<accounts.length;i++)
        {
            for(int j=0;j<accounts[i].length;j++)
                sum+=accounts[i][j];

            maxWealth=Math.max(maxWealth,sum);
            sum=0;
        }
        return maxWealth;
    }
}
