import java.util.*;
import java.io.*;
import java.text.DecimalFormat;
public class J07052 {
    public static class Cont implements Comparable<Cont>{
        private String id, name;
        private float t, l, h, extr;
        public float total, score;
        public String ref(String s){
            s=s.trim().toLowerCase();
            String ss[]=s.split("\\s+");
            String tmp="";
            for(String i:ss) tmp+=i.substring(0, 1).toUpperCase()+i.substring(1)+" ";
            tmp=tmp.trim();
            return tmp;
        }
        public Cont(String id, String name, float t, float l, float h){
            this.id=id; this.name=this.ref(name);
            this.t=t; this.l=l; this.h=h;
            switch(id.charAt(2)){
                case '1':
                    extr=(float)0.5;
                    break;
                case '2':
                    extr=1;
                    break;
                default:
                    extr=(float) 2.5;
                    break;
            }
            total=t*2+l+h+extr;
        }
        public void setScore(float a){
            this.score=a;
        }
        @Override
        public int compareTo(Cont o) {
            if(o.total>this.total) return 1;
            else if(o.total==this.total) return this.id.compareTo(o.id);
            return -1;
        }
        @Override
        public String toString(){
            String res="";
            if(total>=score) res="TRUNG TUYEN";
            else res="TRUOT";
            return id+" "+name+" "+(new DecimalFormat().format(extr))+" "+(new DecimalFormat().format(total))+" "+res;
        }
    }
    public static void main(String[] arg) throws FileNotFoundException{
        Scanner sc=new Scanner(new File("THISINH.in"));
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<Cont> ar=new ArrayList<>();
        while(t-->0){
            ar.add(new Cont(sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine())));
        }
        Collections.sort(ar);
        int n=Integer.parseInt(sc.nextLine());
        float tmp=ar.get(n-1).total;
        System.out.println(String.format("%.1f", tmp));
        for(Cont i:ar){
            i.setScore(tmp);
            System.out.println(i);
        }
    }
}
