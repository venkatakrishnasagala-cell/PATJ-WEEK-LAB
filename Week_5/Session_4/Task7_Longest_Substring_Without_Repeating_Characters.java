import java.util.*;
public class Task7_Longest_Substring_Without_Repeating_Characters {
    public static void main(String[]args){Scanner sc=new Scanner(System.in);String s=sc.nextLine();Map<Character,Integer>m=new HashMap<>();int l=0,b=0;for(int r=0;r<s.length();r++){char c=s.charAt(r);if(m.containsKey(c))l=Math.max(l,m.get(c)+1);m.put(c,r);b=Math.max(b,r-l+1);}System.out.println(b);sc.close();}
}
// Input: abcabcbb
