import java.util.*;
public class J05053 {
    static class don implements Comparable<don>{
        private String ten, ma, stt;
        private int gia, sl, tong, giam;
        public don(String ten, String ma, int gia, int sl){
            this.ten=ten; this.ma=ma; this.gia=gia; this.sl=sl;
            if(ma.charAt(4)=='1') giam=gia*sl/2;
            else giam=gia*sl*3/10;
            tong=gia*sl-giam;
            stt=ma.substring(1, 4);
        }
        
        @Override
        public int compareTo(don o) {
            return this.stt.compareTo(o.stt);
        }
        @Override
        public String toString(){
            return ten+" "+ma+" "+stt+" "+giam+" "+tong;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<don> ar=new ArrayList<>();
        while(t-->0){
            ar.add(new don(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(ar);
        for(don i:ar) System.out.println(i);
    }
}
