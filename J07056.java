import java.util.*;
import java.io.*;
public class J07056 {
    public static class Cus implements Comparable<Cus>{
        private String id, ten;
        private String hgd;
        private long t1, t2, trong, vuot, thue, tong;
        public static int n=1;
        public String ref(String s){
            s=s.trim().toLowerCase();
            String ss[]=s.split("\\s+");
            String tmp="";
            for(String i:ss) tmp+=i.substring(0, 1).toUpperCase()+i.substring(1)+" ";
            tmp=tmp.trim();
            return tmp;
        }
        public void xuli(String s){
            String[] ss=s.split("\\s+");
            hgd=ss[0];
            this.t1=Long.parseLong(ss[1]);
            this.t2=Long.parseLong(ss[2]);
            long muc=0, dien=t2-t1;
            if(hgd.compareTo("A")==0) muc=100;
            else if(hgd.compareTo("B")==0) muc=500;
            else muc=200;
            
            if(dien<=muc) trong=dien*450;
            else trong=muc*450;
            
            if(dien>muc) vuot=(dien-muc)*1000;
            else vuot=0;
            
            thue=5*vuot/100;
            tong=trong+vuot+thue;
        }
        public Cus(String ten, String s){
            this.id=String.format("KH%02d", n++);
            this.ten=ref(ten);
            xuli(s);
        }
        @Override
        public String toString(){
            return id+" "+ten+" "+trong+" "+vuot+" "+thue+" "+tong;
        }
        @Override
        public int compareTo(Cus o){
            return (int)(o.tong-this.tong);
        }
    }
    public static void main(String[] arg) throws FileNotFoundException{
        Scanner sc=new Scanner(new File("KHACHHANG.in"));
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<Cus> ar=new ArrayList<>();
        while(t-->0){
            ar.add(new Cus(sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(ar);
        for(Cus i:ar) System.out.println(i);
    }
}
