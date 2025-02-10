import java.util.*;
public class J05011 {
    static class khach implements Comparable<khach>{
        private String ma, ten, t1, t2, tgian;
        private int t;
        public int tinh(String s){
            int a=Integer.parseInt(s.substring(0, 2))*60+Integer.parseInt(s.substring(3));
            return a;
        }
        public String chuanhoa(String a, String b){
            int c=tinh(a), d=tinh(b);
            d=d-c; this.t=d;
            int gio=d/60, phut=d%60;
            return String.format("%d gio %d phut", gio, phut);
        }
        public khach(String ma, String ten, String t1, String t2){
            this.ma=ma; this.ten=ten; this.t1=t1; this.t2=t2;
            tgian=chuanhoa(this.t1, this.t2);
        }
        @Override
        public int compareTo(khach o) {
            return o.t-this.t;
        }
        @Override
        public String toString(){
            return ma+" "+ten+" "+tgian;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<khach> ar=new ArrayList<>();
        while(t-->0){
            ar.add(new khach(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(ar);
        for(khach i:ar) System.out.println(i);
    }
}
