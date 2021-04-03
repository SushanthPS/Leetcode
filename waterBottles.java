import java.util.*;
public class waterBottles {
    public static void main(String[] args)
    {
        int numBottles=15,numExchange=4;
        int sum=numBottles;
        int balance=0;
        while(numBottles>=numExchange)
        {
            sum+=numBottles/numExchange;
            balance=numBottles%numExchange;
            numBottles/=numExchange;
            numBottles+=balance;

        }
        System.out.println(sum);

    }
}
