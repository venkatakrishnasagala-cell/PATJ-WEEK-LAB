import java.util.*;
public class Strassen_Matrix_Multiplication_Demo {
    static int[][] add(int[][]a,int[][]b){int n=a.length;int[][]c=new int[n][n];for(int i=0;i<n;i++)for(int j=0;j<n;j++)c[i][j]=a[i][j]+b[i][j];return c;}
    static int[][] sub(int[][]a,int[][]b){int n=a.length;int[][]c=new int[n][n];for(int i=0;i<n;i++)for(int j=0;j<n;j++)c[i][j]=a[i][j]-b[i][j];return c;}
    static int[][] mul(int[][]a,int[][]b){
        int n=a.length;if(n==1)return new int[][]{{a[0][0]*b[0][0]}};int h=n/2;
        int[][]a11=new int[h][h],a12=new int[h][h],a21=new int[h][h],a22=new int[h][h],b11=new int[h][h],b12=new int[h][h],b21=new int[h][h],b22=new int[h][h];
        for(int i=0;i<h;i++)for(int j=0;j<h;j++){a11[i][j]=a[i][j];a12[i][j]=a[i][j+h];a21[i][j]=a[i+h][j];a22[i][j]=a[i+h][j+h];b11[i][j]=b[i][j];b12[i][j]=b[i][j+h];b21[i][j]=b[i+h][j];b22[i][j]=b[i+h][j+h];}
        int[][]p1=mul(add(a11,a22),add(b11,b22)),p2=mul(add(a21,a22),b11),p3=mul(a11,sub(b12,b22)),p4=mul(a22,sub(b21,b11)),p5=mul(add(a11,a12),b22),p6=mul(sub(a21,a11),add(b11,b12)),p7=mul(sub(a12,a22),add(b21,b22));
        int[][]c11=add(sub(add(p1,p4),p5),p7),c12=add(p3,p5),c21=add(p2,p4),c22=add(sub(add(p1,p3),p2),p6),c=new int[n][n];
        for(int i=0;i<h;i++)for(int j=0;j<h;j++){c[i][j]=c11[i][j];c[i][j+h]=c12[i][j];c[i+h][j]=c21[i][j];c[i+h][j+h]=c22[i][j];}return c;
    }
    public static void main(String[]args){Scanner sc=new Scanner(System.in);int n=sc.nextInt();if((n&(n-1))!=0){System.out.println("Size must be a power of 2.");return;}int[][]a=new int[n][n],b=new int[n][n];for(int i=0;i<n;i++)for(int j=0;j<n;j++)a[i][j]=sc.nextInt();for(int i=0;i<n;i++)for(int j=0;j<n;j++)b[i][j]=sc.nextInt();for(int[]row:mul(a,b))System.out.println(Arrays.toString(row));sc.close();}
}
// Input:
// 2
// 1 2
// 3 4
// 5 6
// 7 8
