import java.util.*;
public class Task6_Alternating_Characters {
    public static void main(String[]args){Scanner sc=new Scanner(System.in);int t=sc.nextInt();while(t-->0){String s=sc.next();int ans=0;for(int i=1;i<s.length();i++)if(s.charAt(i)==s.charAt(i-1))ans++;System.out.println(ans);}sc.close();}
}
// Input:
// 2
// AABAAB
// AAAA
