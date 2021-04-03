import java.util.*;
public class addToArrayFormOfInteger {
    public static void main(String[] args)
    {
        int[] A={1,2,3};
        int K=181;
        System.out.println(addToArrayForm(A,K));
    }
    public static List<Integer> addToArrayForm(int[] A,int K)
    {
        LinkedList<Integer> list=new LinkedList<>();
        int carry=0;
        int l=A.length-1;
        while(l>=0 || K!=0)
        {
            int x1=l>=0?A[l]:0;
            int x2=K%10;

            K=K/10;
            l--;

            int value=x1+x2+carry;
            list.addFirst(value%10);
            carry=value/10;
        }
        if(carry>0)
            list.addFirst(carry);


        return list;

    }
}
