import java.util.*;
public class canMakeArithmeticProgressionFromSequence {
    public static void main(String[] args)
    {
        int[] arr={3,5,1};

        Arrays.sort(arr);
        int diff=arr[1]-arr[0];

        for(int i=2;i<arr.length;i++)
            if(arr[i]-arr[i-1]!=diff) {
                System.out.println("False");
                break;
            }

    }
}
