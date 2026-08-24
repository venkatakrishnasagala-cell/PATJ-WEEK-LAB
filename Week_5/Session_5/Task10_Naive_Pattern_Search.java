import java.util.*;
public class Task10_Naive_Pattern_Search {
    public static void main(String[]args){Scanner sc=new Scanner(System.in);String t=sc.nextLine(),p=sc.nextLine();List<Integer>a=new ArrayList<>();for(int i=0;i+p.length()<=t.length();i++){int j=0;while(j<p.length()&&t.charAt(i+j)==p.charAt(j))j++;if(j==p.length())a.add(i);}System.out.println(a);sc.close();}
}
// Input:
// AABAACAADAABAABA
// AABA
