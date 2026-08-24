import java.util.*;
public class Task7_Palindrome_Index {
    static boolean p(String s,int l,int r){while(l<r)if(s.charAt(l++)!=s.charAt(r--))return false;return true;}
    static int solve(String s){int l=0,r=s.length()-1;while(l<r&&s.charAt(l)==s.charAt(r)){l++;r--;}if(l>=r)return -1;if(p(s,l+1,r))return l;if(p(s,l,r-1))return r;return -1;}
    public static void main(String[]args){Scanner sc=new Scanner(System.in);int t=sc.nextInt();while(t-->0)System.out.println(solve(sc.next()));sc.close();}
}
// Input:
// 3
// aaab
// baa
// aaa
