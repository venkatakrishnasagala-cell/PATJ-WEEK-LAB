import java.util.*;
public class Task6_Find_All_Anagrams_in_a_String {
    public static void main(String[]args){Scanner sc=new Scanner(System.in);String s=sc.nextLine(),p=sc.nextLine();List<Integer>a=new ArrayList<>();int[]need=new int[26],win=new int[26];for(char c:p.toCharArray())need[c-'a']++;for(int i=0;i<s.length();i++){win[s.charAt(i)-'a']++;if(i>=p.length())win[s.charAt(i-p.length())-'a']--;if(i>=p.length()-1&&Arrays.equals(need,win))a.add(i-p.length()+1);}System.out.println(a);sc.close();}
}
// Input:
// cbaebabacd
// abc
