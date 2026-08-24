import java.util.*;
public class Task9_Matrix_Block_Sum {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);int r=sc.nextInt(),c=sc.nextInt(),k=sc.nextInt();int[][]a=new int[r][c],p=new int[r+1][c+1];
        for(int i=0;i<r;i++)for(int j=0;j<c;j++){a[i][j]=sc.nextInt();p[i+1][j+1]=a[i][j]+p[i][j+1]+p[i+1][j]-p[i][j];}
        for(int i=0;i<r;i++){for(int j=0;j<c;j++){int r1=Math.max(0,i-k),r2=Math.min(r-1,i+k),c1=Math.max(0,j-k),c2=Math.min(c-1,j+k);int x=p[r2+1][c2+1]-p[r1][c2+1]-p[r2+1][c1]+p[r1][c1];if(j>0)System.out.print(" ");System.out.print(x);}System.out.println();}sc.close();
    }
}
// Input:
// 3 3 1
// 1 2 3
// 4 5 6
// 7 8 9
