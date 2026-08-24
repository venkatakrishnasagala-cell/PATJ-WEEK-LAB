import java.util.*;
public class Task8_Find_and_Replace_Pattern {
    static boolean match(String w,String p){if(w.length()!=p.length())return false;Map<Character,Character>a=new HashMap<>(),b=new HashMap<>();for(int i=0;i<w.length();i++){char x=w.charAt(i),y=p.charAt(i);if(a.containsKey(x)&&a.get(x)!=y)return false;if(b.containsKey(y)&&b.get(y)!=x)return false;a.put(x,y);b.put(y,x);}return true;}
    public static void main(String[]args){Scanner sc=new Scanner(System.in);int n=sc.nextInt();String p=sc.next();List<String>ans=new ArrayList<>();for(int i=0;i<n;i++){String w=sc.next();if(match(w,p))ans.add(w);}System.out.println(ans);sc.close();}
}
// Input:
// 6
// abb
// abc
// deq
// mee
// aqq
// dkd
// ifn
