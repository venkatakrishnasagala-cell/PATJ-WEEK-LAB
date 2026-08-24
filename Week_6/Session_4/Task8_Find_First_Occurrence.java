import java.util.*;
public class Task8_Find_First_Occurrence {
    public static void main(String[]args){Scanner sc=new Scanner(System.in);String h=sc.nextLine(),n=sc.nextLine();int ans=-1;if(n.isEmpty())ans=0;else for(int i=0;i+n.length()<=h.length();i++){int j=0;while(j<n.length()&&h.charAt(i+j)==n.charAt(j))j++;if(j==n.length()){ans=i;break;}}System.out.println(ans);sc.close();}
}
// Input:
// sadbutsad
// sad
