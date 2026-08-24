import java.util.*;
public class Task5_Mars_Exploration {
    public static void main(String[]args){Scanner sc=new Scanner(System.in);String s=sc.next();String p="SOS";int ans=0;for(int i=0;i<s.length();i++)if(s.charAt(i)!=p.charAt(i%3))ans++;System.out.println(ans);sc.close();}
}
// Input: SOSSPSSQSSOR
