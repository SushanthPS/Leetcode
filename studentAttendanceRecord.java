import java.util.*;
public class studentAttendanceRecord {
    public static void main(String[] args)
    {
        String s="PPALLL";
        int countOfA=0;
        for(int i=0;i<s.length();i++)
            if(s.charAt(i)=='A') {
                countOfA++;
                if (countOfA > 1)
                    System.out.println("false");
            }

        int countOfL=0;
        for(int i=0;i<s.length();i++)
            if(s.charAt(i)=='L')
            {
                countOfL++;
                if(countOfL>2)
                    System.out.println("false");
            }
            else
                countOfL=0;

    }
}
