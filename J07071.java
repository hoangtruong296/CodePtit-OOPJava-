import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class J07071 {
    public static class hoten implements Comparable<hoten>{
        private String ht, ho, ten;
        private String[] vt;
        public hoten(String s){
            ht=s;
            vt=s.split("\\s+");
            ho=vt[0];
            ten=vt[vt.length-1];
            for(int i=0; i<vt.length; i++){
                vt[i]=vt[i].substring(0, 1);
            }
        }
        public boolean sosanh(String s[]){
            int sao=0, sai=0;
            if(s.length!=vt.length) return false;
            for(int i=0; i<s.length; i++){
                if(s[i].equals("*")) sao++;
                if(!s[i].equals(vt[i])) sai++;
            }
            if(sao==sai && sao==1) return true;
            if(sai==0) return true;
            return false;
        }
        @Override
        public int compareTo(hoten o) {
            if(this.ten.equals(o.ten)){
                return this.ho.compareTo(o.ho);
            }
            return this.ten.compareTo(o.ten);
        }
        @Override
        public String toString(){
            return ht;
        }
    }
    public static void main(String[] arg) throws FileNotFoundException{
        Scanner sc=new Scanner(new File("DANHSACH.in"));
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<hoten> ar=new ArrayList<>();
        while(t-->0){
            ar.add(new hoten(sc.nextLine()));
        }
        Collections.sort(ar);
        t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s=sc.nextLine();
            String ss[]=s.split("\\.");
            for(hoten i:ar){
                if(i.sosanh(ss)) System.out.println(i);
            }
        }
    }
}
