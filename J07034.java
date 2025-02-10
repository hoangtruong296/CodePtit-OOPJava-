import java.io.File;
import java.io.IOException;
import java.util.*;
public class J07034 {
    static class Sub implements Comparable<Sub>{
        private String id;
        private String name;
        private String credit;

        public Sub(String id, String name, String credit) {
            this.id = id;
            this.name = name;
            this.credit = credit;
        }

        @Override
        public String toString() {
            return id + " " + name + " " + credit;
        }

        @Override
        public int compareTo(Sub o){
            return this.name.compareTo(o.name);
        }
    }
    public static void main(String[] args) throws  IOException{
        Scanner sc = new Scanner(new File("MONHOC.in"));
        ArrayList<Sub> li = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n-- != 0){
            li.add(new Sub(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(li);
        for(Sub x : li){
            System.out.println(x);
        }
    }

}
