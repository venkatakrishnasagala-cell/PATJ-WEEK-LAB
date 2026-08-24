import java.util.*;

public class Week_3_Session_15_02_Java_Sort {
    static class Student {
        int id;
        String name;
        double cgpa;
        Student(int id, String name, double cgpa) {
            this.id = id; this.name = name; this.cgpa = cgpa;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] a = new Student[n];
        for (int i = 0; i < n; i++)
            a[i] = new Student(sc.nextInt(), sc.next(), sc.nextDouble());

        Arrays.sort(a, (x, y) -> {
            int c = Double.compare(y.cgpa, x.cgpa);
            if (c != 0) return c;
            return Integer.compare(x.id, y.id);
        });

        for (Student s : a) System.out.println(s.name);
        sc.close();
    }
}
