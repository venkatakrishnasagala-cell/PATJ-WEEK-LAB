import java.util.*;
public class Task10_Matrix_Rotation_Algo {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);int m=sc.nextInt(),n=sc.nextInt(),rot=sc.nextInt();int[][]a=new int[m][n];for(int i=0;i<m;i++)for(int j=0;j<n;j++)a[i][j]=sc.nextInt();
        for(int layer=0;layer<Math.min(m,n)/2;layer++){
            int top=layer,left=layer,bottom=m-1-layer,right=n-1-layer;List<Integer>v=new ArrayList<>();
            for(int j=left;j<=right;j++)v.add(a[top][j]);for(int i=top+1;i<=bottom;i++)v.add(a[i][right]);for(int j=right-1;j>=left;j--)v.add(a[bottom][j]);for(int i=bottom-1;i>top;i--)v.add(a[i][left]);
            int shift=rot%v.size(),q=0;for(int j=left;j<=right;j++)a[top][j]=v.get((q+++shift)%v.size());for(int i=top+1;i<=bottom;i++)a[i][right]=v.get((q+++shift)%v.size());for(int j=right-1;j>=left;j--)a[bottom][j]=v.get((q+++shift)%v.size());for(int i=bottom-1;i>top;i--)a[i][left]=v.get((q+++shift)%v.size());
        }
        for(int[]row:a){for(int j=0;j<n;j++){if(j>0)System.out.print(" ");System.out.print(row[j]);}System.out.println();}sc.close();
    }
}
// Input:
// 4 4 2
// 1 2 3 4
// 5 6 7 8
// 9 10 11 12
// 13 14 15 16
