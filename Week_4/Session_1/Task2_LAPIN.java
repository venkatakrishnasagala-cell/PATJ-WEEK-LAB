import java.util.*;
public class Task2_LAPIN {
    static boolean solve(String s){
        int n=s.length(), h=n/2; int[] f=new int[26];
        for(int i=0;i<h;i++) f[s.charAt(i)-'a']++;
        for(int i=(n+1)/2;i<n;i++) f[s.charAt(i)-'a']--;
        for(int x:f) if(x!=0) return false;
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); int t=sc.nextInt();
        while(t-->0) System.out.println(solve(sc.next())?"YES":"NO");
        sc.close();
    }
}
// Input:
// 3
// gaga
// abcde
// rotor
