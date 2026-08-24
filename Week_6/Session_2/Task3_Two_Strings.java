import java.util.*;
public class Task3_Two_Strings {
    public static void main(String[]args){Scanner sc=new Scanner(System.in);int t=sc.nextInt();while(t-->0){String a=sc.next(),b=sc.next();boolean[]x=new boolean[26];for(char c:a.toCharArray())x[c-'a']=true;boolean ok=false;for(char c:b.toCharArray())if(x[c-'a']){ok=true;break;}System.out.println(ok?"YES":"NO");}sc.close();}
}
// Input:
// 2
// hello world
// hi world
