import java.util.*;
public class Task2_Repeated_Substring_Pattern {
    public static void main(String[]args){Scanner sc=new Scanner(System.in);String s=sc.nextLine();System.out.println((s+s).substring(1,2*s.length()-1).contains(s));sc.close();}
}
// Input: abab
