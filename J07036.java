import java.util.*;
import java.io.*;
public class J07036 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc=new Scanner(new File("SINHVIEN.in"));
        //E:\\OOP\\Java\\src\\javaapplication1\\1.txt
        int t=Integer.parseInt(sc.nextLine());
        Map<String, sv> mpsv=new TreeMap<>();
        while(t-->0){
            sv a=new sv(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            mpsv.put(a.getMa(), a);
        }
        sc=new Scanner(new File("MONHOC.in"));
        t=Integer.parseInt(sc.nextLine());
        Map<String, mon> mpmon=new TreeMap<>();
        while(t-->0){
            mon a=new mon(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            mpmon.put(a.getMa(), a);
        }
        sc=new Scanner(new File("BANGDIEM.in"));
        t=Integer.parseInt(sc.nextLine());
        List<bang> li=new ArrayList<>();
        while(t-->0){
            String s=sc.nextLine();
            String[] ss=s.split("\\s+");
            li.add(new bang(ss[2], mpsv.get(ss[0]), mpmon.get(ss[1])));
        }
        t=Integer.parseInt(sc.nextLine());
        Collections.sort(li);
        while(t-->0){
            String s=sc.nextLine();
            System.out.println("BANG DIEM lop "+s+":");
            for(bang i:li) if(i.getLopSv().equals(s)) System.out.println(i);
        }
        
    }
}
class sv{
    private String ma, ten, lop, mail;

    public sv(String ma, String ten, String lop, String mail) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.mail = mail;
        reform();
    }
    
    private void reform(){
        String[] s=ten.toLowerCase().trim().split("\\s+");
        ten="";
        for(String i:s) ten+=i.substring(0, 1).toUpperCase()+i.substring(1)+" ";
        ten=ten.trim();
    }
    
    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getLop() {
        return lop;
    }

    public String getMail() {
        return mail;
    }
    
}
class mon{
    private String ma, ten;
    private int tin;

    public mon(String ma, String ten, int tin) {
        this.ma = ma;
        this.ten = ten;
        this.tin = tin;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public int getTin() {
        return tin;
    }
    
}
class bang implements Comparable<bang>{
    private String diem;
    private sv svien;
    private mon m;

    public bang(String diem, sv svien, mon m) {
        this.diem = diem;
        this.svien = svien;
        this.m = m;
    }
    public String getLopSv(){
        return svien.getLop();
    }
    public String getMaSv(){
        return svien.getMa();
    }
    public String getMaMon(){
        return m.getMa();
    }
    @Override
    public String toString(){
        return svien.getMa()+" "+svien.getTen()+" "+m.getMa()+" "+m.getTen()+" "+diem;
    }

    @Override
    public int compareTo(bang o) {
        if(o.getMaMon().equals(this.getMaMon())) return this.getMaSv().compareTo(o.getMaSv());
        return this.getMaMon().compareTo(o.getMaMon());
    }
}
