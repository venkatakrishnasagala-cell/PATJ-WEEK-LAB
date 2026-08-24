import java.util.*;
public class Task5_String_to_Integer_ATOI {
    static int atoi(String s){int i=0,n=s.length(),sign=1;long r=0;while(i<n&&s.charAt(i)==' ')i++;if(i<n&&(s.charAt(i)=='+'||s.charAt(i)=='-')){if(s.charAt(i)=='-')sign=-1;i++;}while(i<n&&Character.isDigit(s.charAt(i))){r=r*10+s.charAt(i++)-'0';long v=r*sign;if(v>Integer.MAX_VALUE)return Integer.MAX_VALUE;if(v<Integer.MIN_VALUE)return Integer.MIN_VALUE;}return(int)(r*sign);}
    public static void main(String[]args){Scanner sc=new Scanner(System.in);System.out.println(atoi(sc.nextLine()));sc.close();}
}
// Input: "   -42"
