import java.util.*;
public class Task10_Circular_Palindromes {
    static int longest(String s){int n=s.length(),best=1;for(int c=0;c<n;c++){int l=c,r=c;while(l>=0&&r<n&&s.charAt(l)==s.charAt(r)){best=Math.max(best,r-l+1);l--;r++;}l=c;r=c+1;while(l>=0&&r<n&&s.charAt(l)==s.charAt(r)){best=Math.max(best,r-l+1);l--;r++;}}return best;}
    public static void main(String[]args){Scanner sc=new Scanner(System.in);int n=sc.nextInt();String s=sc.next();for(int k=0;k<n;k++){String rot=s.substring(k)+s.substring(0,k);System.out.println(longest(rot));}sc.close();}
}
// Input:
// 7
// cacbbba
// Output: 3 on each line
// Note: this clear implementation is for local/sample use; the HackerRank
// problem has advanced large constraints requiring further optimization.
