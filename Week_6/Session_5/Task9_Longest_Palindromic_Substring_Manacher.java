import java.util.*;
public class Task9_Longest_Palindromic_Substring_Manacher {
    static String solve(String s){if(s.isEmpty())return "";char[]t=new char[2*s.length()+3];int k=0;t[k++]='^';for(char c:s.toCharArray()){t[k++]='#';t[k++]=c;}t[k++]='#';t[k]='$';int[]p=new int[t.length];int c=0,r=0,b=0,bc=0;for(int i=1;i<t.length-1;i++){int m=2*c-i;if(i<r)p[i]=Math.min(r-i,p[m]);while(t[i+1+p[i]]==t[i-1-p[i]])p[i]++;if(i+p[i]>r){c=i;r=i+p[i];}if(p[i]>b){b=p[i];bc=i;}}int start=(bc-b)/2;return s.substring(start,start+b);}
    public static void main(String[]args){Scanner sc=new Scanner(System.in);System.out.println(solve(sc.nextLine()));sc.close();}
}
// Input: babad
