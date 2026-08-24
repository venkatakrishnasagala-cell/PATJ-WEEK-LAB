import java.util.*;
public class Task4_Maximum_Sum_Circular_Subarray {
    public static void main(String[]args){Scanner sc=new Scanner(System.in);int n=sc.nextInt(),total=0,maxCur=0,max=Integer.MIN_VALUE,minCur=0,min=Integer.MAX_VALUE;for(int i=0;i<n;i++){int x=sc.nextInt();total+=x;maxCur=Math.max(x,maxCur+x);max=Math.max(max,maxCur);minCur=Math.min(x,minCur+x);min=Math.min(min,minCur);}System.out.println(max<0?max:Math.max(max,total-min));sc.close();}
}
// Input: 5 / 5 -3 5 -2 1
