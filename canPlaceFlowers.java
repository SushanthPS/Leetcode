import java.util.*;
public class canPlaceFlowers {
    public static void main(String[] args)
    {
        int[] flowerbed={1,0,0,0,1};
        int n=1;
        System.out.println(canPlaceFlower(flowerbed,n));

    }

    private static boolean canPlaceFlower(int[] flowerbed, int n) {
        int i=0;
        while(i<flowerbed.length)
        {
            if(flowerbed[i]==0 && (i==0 || flowerbed[i-1]==0) && (i==flowerbed.length-1 || flowerbed[i+1]==0))
            {
                flowerbed[i]=1;
                n--;
            }
            i++;
            if(n<=0)
                return true;
        }
        return false;
    }
}
