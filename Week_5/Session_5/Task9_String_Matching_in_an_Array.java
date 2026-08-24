import java.util.*;
public class Task9_String_Matching_in_an_Array {
    public static void main(String[]args){Scanner sc=new Scanner(System.in);int n=sc.nextInt();String[]a=new String[n];for(int i=0;i<n;i++)a[i]=sc.next();List<String>ans=new ArrayList<>();for(int i=0;i<n;i++)for(int j=0;j<n;j++)if(i!=j&&a[j].contains(a[i])){ans.add(a[i]);break;}System.out.println(ans);sc.close();}
}
// Input:
// 4
// mass
// as
// hero
// superhero
