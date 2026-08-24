import java.util.*;
public class Task5_Time_Conversion {
    static String solve(String s){
        int h=Integer.parseInt(s.substring(0,2)); String ap=s.substring(8);
        if(ap.equals("AM") && h==12)h=0;
        if(ap.equals("PM") && h!=12)h+=12;
        return String.format("%02d%s",h,s.substring(2,8));
    }
    public static void main(String[] args){Scanner sc=new Scanner(System.in);System.out.println(solve(sc.next()));sc.close();}
}
// Input: 07:05:45PM
// Output: 19:05:45
