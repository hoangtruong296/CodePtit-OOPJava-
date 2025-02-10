import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class J07055 {
    public static class stu implements Comparable<stu>{
        private String name, id;
        private float sc1, sc2, sc3, total;
        private String rating;
        public static int n=1;
        
        public String ref(String s){
            String ss[]=s.trim().toLowerCase().split("\\s+");
            String res="";
            for(String i:ss){
                res+=i.substring(0, 1).toUpperCase()+i.substring(1)+" ";
            }
            return res.trim();
        }
        public stu(String name, float sc1, float sc2, float sc3){
            id=String.format("SV%02d", n++);
            this.name=ref(name);
            this.sc1=sc1; this.sc2=sc2; this.sc3=sc3;
            total=(float) (this.sc1*0.25+this.sc2*0.35+this.sc3*0.4);
            if(total>=8.0) rating="GIOI";
            else if(total>=6.5 && total<8) rating="KHA";
            else if(total>=5 && total<6.5) rating="TRUNG BINH";
            else rating="KEM";
        }
        
        @Override
        public int compareTo(stu o) {
            if(o.total>this.total) return 1;
            else if(o.total==this.total) return this.id.compareTo(o.id);
            return -1;
        }
        @Override
        public String toString(){
            return id+" "+name+" "+String.format("%.2f", total)+" "+rating;
        }
    }
    
    public static void main(String[] arg) throws FileNotFoundException{
        Scanner sc=new Scanner(new File("BANGDIEM.in"));
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<stu> ar=new ArrayList<>();
        while(t-->0){
            ar.add(new stu(sc.nextLine(), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine())));
        }
        Collections.sort(ar);
        for(stu i:ar){
            System.out.println(i);
        }
    }
}
