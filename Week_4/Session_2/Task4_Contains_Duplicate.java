import java.util.*;
public class Task4_Contains_Duplicate {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); int n=sc.nextInt(); Set<Integer>s=new HashSet<>();
        boolean dup=false;
        for(int i=0;i<n;i++) if(!s.add(sc.nextInt())) dup=true;
        System.out.println(dup); sc.close();
    }
}
// Input: 4 / 1 2 3 1
