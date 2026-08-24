import java.util.*;
public class Task3_HackerRank_MaxSubarray {
    static int[] solve(int[]a){int cur=a[0],best=a[0],positive=0;for(int x:a)if(x>0)positive+=x;for(int i=1;i<a.length;i++){cur=Math.max(a[i],cur+a[i]);best=Math.max(best,cur);}return new int[]{best,positive==0?best:positive};}
    public static void main(String[]args){Scanner sc=new Scanner(System.in);int t=sc.nextInt();while(t-->0){int n=sc.nextInt();int[]a=new int[n];for(int i=0;i<n;i++)a[i]=sc.nextInt();int[]x=solve(a);System.out.println(x[0]+" "+x[1]);}sc.close();}
}
// Input:
// 2
// 4
// 1 2 3 4
// 6
// 2 -1 2 3 4 -5
