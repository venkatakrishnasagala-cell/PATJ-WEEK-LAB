import java.util.*;
public class Task3_Compare_the_Triplets {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); int a=0,b=0;
        for(int i=0;i<3;i++){int x=sc.nextInt(),y=sc.nextInt(); if(x>y)a++; else if(x<y)b++;}
        System.out.println(a+" "+b); sc.close();
    }
}
// Input:
// 5 6 7
// 3 6 10
// Output: 1 1
