import java.util.*;
public class Task6_Move_Zeroes {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); int n=sc.nextInt(),k=0; int[]a=new int[n];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        for(int x:a)if(x!=0)a[k++]=x;
        while(k<n)a[k++]=0;
        System.out.println(Arrays.toString(a));sc.close();
    }
}
// Input: 5 / 0 1 0 3 12
