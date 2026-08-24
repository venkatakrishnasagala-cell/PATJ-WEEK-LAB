import java.util.*;
public class Task7_Diagonal_Difference {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);int n=sc.nextInt(),a=0,b=0;
        for(int i=0;i<n;i++)for(int j=0;j<n;j++){int x=sc.nextInt();if(i==j)a+=x;if(i+j==n-1)b+=x;}
        System.out.println(Math.abs(a-b));sc.close();
    }
}
// Input:
// 3
// 11 2 4
// 4 5 6
// 10 8 -12
// Output: 15
