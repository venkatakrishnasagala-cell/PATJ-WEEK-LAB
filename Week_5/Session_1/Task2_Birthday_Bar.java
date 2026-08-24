import java.util.*;
public class Task2_Birthday_Bar {
    public static void main(String[]args){Scanner sc=new Scanner(System.in);int n=sc.nextInt(),sum=0,count=0;int[]a=new int[n];for(int i=0;i<n;i++)a[i]=sc.nextInt();int d=sc.nextInt(),m=sc.nextInt();for(int i=0;i<n;i++){sum+=a[i];if(i>=m)sum-=a[i-m];if(i>=m-1&&sum==d)count++;}System.out.println(count);sc.close();}
}
// Input:
// 5
// 1 2 1 3 2
// 3 2
