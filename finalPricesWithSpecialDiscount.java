import java.util.Arrays;

public class finalPricesWithSpecialDiscount {
    public static void main(String[] args)
    {
        int[] prices={10,1,1,6};
        System.out.println(Arrays.toString(finalPrices(prices)));
    }
    public static int[] finalPrices(int[] prices)
    {
        int n=prices.length;
        for(int i=0;i<n-1;i++)
            for (int j = i + 1; j < n; j++)
                if (prices[j] <= prices[i])
                {
                    prices[i] = prices[i] - prices[j];
                    break;
                }

        return prices;


    }
}
