import java.util.*;
public class distanceValueBetween2Arrays {
    public static void main(String[] args)
    {
        int[] arr1={4,5,8};
        int[] arr2={10,9,1,8};
        int d=2;

        int count=0;
        boolean flag=true;

        for(int i=0;i<arr1.length;i++)
        {

            for(int j=0;j<arr2.length;j++)
                if(Math.abs(arr2[j]-arr1[i])<=d)
                {
                    flag=false;
                    break;
                }
            if(flag)
                count++;

            flag=true;


        }
        System.out.println(count);
    }
}
