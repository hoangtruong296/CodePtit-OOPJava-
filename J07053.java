import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
public class J07053 {
    static class Candidate{
        public static int n = 1;
        private String ID;
        private String Name;
        private String dob;
        private int age;
        private double theory;
        private double practice;
        private double bonus;
        private int finall;
        private String mod;

        public String stdDOB(String dob){
            StringBuilder sb = new StringBuilder(dob);
            if(sb.charAt(1) == '/')sb.insert(0, '0');
            if(sb.charAt(4) == '/')sb.insert(3, '0');
            return sb.toString();
        }
        public String stdName(String name){
            StringBuilder sb = new StringBuilder("");
            String[] word = name.split(" ");
            for(String x : word){
                if(!x.isEmpty()){
                    x = x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase();
                    sb.append(x).append(" ");
                }
            }
            sb.deleteCharAt(sb.length() - 1);
            return sb.toString();
        }
        public Candidate(String Name, String dob, double theory, double practice) {
            this.ID = "PH" + String.format("%02d", n++);
            this.Name = stdName(Name);
            this.dob = stdDOB(dob);
            this.age = 2021 - Integer.parseInt(this.dob.substring(6));
            this.theory = theory;
            this.practice = practice;
            
            if(theory >= 8 && practice >= 8)this.bonus = 1;
            else if(theory>= 7.5 && practice >= 7.5)this.bonus= 0.5;
            else this.bonus = 0;
            
            this.finall= (int) Math.round((this.theory + this.practice) / 2 + this.bonus);
            if(this.finall >= 10)this.finall = 10;
            if(this.finall < 5)mod = "Truot";
            else if(this.finall < 7)mod = "Trung binh";
            else if(this.finall == 7)mod = "Kha";
            else if(this.finall == 8)mod = "Gioi";
            else mod = "Xuat sac";
        }

        @Override
        public String toString() {
            return ID + " " + Name + " " + age + " " + finall + " " + mod;
        }

    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Candidate> ar = new ArrayList<>();
        while(n-- != 0){
            ar.add(new Candidate(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        for(Candidate x : ar){
            System.out.println(x);
        }
    }

}
