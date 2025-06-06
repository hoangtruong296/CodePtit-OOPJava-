import java.io.File;
import java.io.IOException;
import java.util.*;
public class J07010 {
    static class Stu {
        public static int n = 1;
        private String id, name, clas, dob;
        private double gpa;

        public Stu(String name, String clas, String dob, double gpa) {
            this.id = "B20DCCN" + String.format("%03d", n++);
            this.name = name;
            this.clas = clas;
            StringBuilder sb = new StringBuilder(dob);
            if(sb.charAt(1) == '/')sb.insert(0, '0');
            if(sb.charAt(4) == '/')sb.insert(3, '0');
            this.dob = sb.toString();
            this.gpa = gpa;
        }

        @Override
        public String toString() {
            return id + " " + name + " " + clas + " " + dob + " " + String.format("%.2f", gpa);
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("SV.in"));
        int n = Integer.parseInt(sc.nextLine());
        while(n-- != 0){
            System.out.println(new Stu(sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine())));
        }
    }
}
