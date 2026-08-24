import java.util.*;
public class Task1_String_Similarity_Z_Algorithm {
    static long solve(String s){int n=s.length(),l=0,r=0;int[]z=new int[n];long sum=n;for(int i=1;i<n;i++){if(i<=r)z[i]=Math.min(r-i+1,z[i-l]);while(i+z[i]<n&&s.charAt(z[i])==s.charAt(i+z[i]))z[i]++;if(i+z[i]-1>r){l=i;r=i+z[i]-1;}sum+=z[i];}return sum;}
    public static void main(String[]args){Scanner sc=new Scanner(System.in);int t=sc.nextInt();while(t-->0)System.out.println(solve(sc.next()));sc.close();}
}
// Input:
// 2
// ababaa
// aa
