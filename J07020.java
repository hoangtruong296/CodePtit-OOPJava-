import java.util.*;
import java.io.*;
public class J07020 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc=new Scanner(new File("KH.in"));
        int t=Integer.parseInt(sc.nextLine());
        Map<String, kh> mpkh=new TreeMap<>();
        Map<String, mh> mpmh=new TreeMap<>();
        List<hd> li=new ArrayList<>();
        while(t-->0){
            kh tmp=new kh(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            mpkh.put(tmp.getMa(), tmp);
        }
        sc=new Scanner(new File("MH.in"));
        t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            mh tmp=new mh(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            mpmh.put(tmp.getMa(), tmp);
        }
        sc=new Scanner(new File("HD.in"));
        t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            kh a; mh b;
            String s=sc.nextLine();
            String[] ss=s.split("\\s+");
            li.add(new hd(Integer.parseInt(ss[2]), mpkh.get(ss[0]), mpmh.get(ss[1])));
            
        }
        for(hd i:li) System.out.println(i);
    }
}
class kh{
    private String ma, ten, gt, ns, dc;
    public static int n=1;
    public kh(String ten, String gt, String ns, String dc) {
        ma=String.format("KH%03d", n++);
        this.ten = ten;
        this.gt = gt;
        this.ns = ns;
        this.dc = dc;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getDc() {
        return dc;
    }
    
}
class mh{
    private String ma, ten, dv;
    private int mua, ban;
    public static int n=1;
    public mh(String ten, String dv, int mua, int ban) {
        ma=String.format("MH%03d", n++);
        this.ten = ten;
        this.dv = dv;
        this.mua = mua;
        this.ban = ban;
    }
    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getDv() {
        return dv;
    }

    public int getMua() {
        return mua;
    }

    public int getBan() {
        return ban;
    }
    
}
class hd{
    private String ma;
    private int sl;
    private kh khach;
    private mh hang;
    public static int n=1;
    public hd(int sl, kh khach, mh hang) {
        ma=String.format("HD%03d", n++);
        this.sl = sl;
        this.khach = khach;
        this.hang = hang;
    } 
    @Override
    public String toString(){
        return ma+" "+khach.getTen()+" "+khach.getDc()+" "+hang.getTen()+" "+hang.getDv()
                +" "+hang.getMua()+" "+hang.getBan()+" "+sl+" "+hang.getBan()*sl;
    }
}