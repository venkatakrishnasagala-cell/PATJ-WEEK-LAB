import java.util.*;
public class Task1_Maximum_Subarray {
    public static void main(String[]args){Scanner sc=new Scanner(System.in);int n=sc.nextInt(),cur=0,best=Integer.MIN_VALUE;for(int i=0;i<n;i++){int x=sc.nextInt();cur=Math.max(x,cur+x);best=Math.max(best,cur);}System.out.println(best);sc.close();}
}
// Input: 9 / -2 1 -3 4 -1 2 1 -5 4
