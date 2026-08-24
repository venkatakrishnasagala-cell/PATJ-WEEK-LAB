import java.util.*;
public class Task4_Rotate_String {
    public static void main(String[]args){Scanner sc=new Scanner(System.in);String s=sc.nextLine(),g=sc.nextLine();System.out.println(s.length()==g.length()&&(s+s).contains(g));sc.close();}
}
// Input:
// abcde
// cdeab
