import java.util.*;
public class Task8_Transpose_Matrix {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);int r=sc.nextInt(),c=sc.nextInt();int[][]a=new int[r][c];
        for(int i=0;i<r;i++)for(int j=0;j<c;j++)a[i][j]=sc.nextInt();
        for(int j=0;j<c;j++){for(int i=0;i<r;i++){if(i>0)System.out.print(" ");System.out.print(a[i][j]);}System.out.println();}
        sc.close();
    }
}
// Input:
// 2 3
// 1 2 3
// 4 5 6
