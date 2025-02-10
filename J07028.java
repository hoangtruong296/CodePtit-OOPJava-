import java.util.*;
import java.io.*;
public class J07028 {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        Scanner sc=new Scanner(new File("MONHOC.in"));
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s=sc.nextLine();
        }
        
        sc=new Scanner(new File("GIANGVIEN.in"));
        t=Integer.parseInt(sc.nextLine());
        Map<String, gv> mp=new TreeMap<>();
        while(t-->0){
            String s=sc.nextLine();
            String ma=s.substring(0, s.indexOf(" ")), ten=s.substring(s.indexOf(" ")+1);
            mp.put(ma, new gv(ma, ten));
        }
        ObjectOutputStream fw=new ObjectOutputStream(new FileOutputStream("E:\\OOP\\Java\\src\\javaapplication1\\1.txt"));

        sc=new Scanner(new File("GIOCHUAN.in"));
        t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s=sc.nextLine();
            System.out.println(new gio(Double.parseDouble(s.split("\\s+")[2]), mp.get(s.split("\\s+")[0])));
            //fw.writeObject(new gio(Double.parseDouble(s.split("\\s+")[2]), mp.get(s.split("\\s+")[0])));
        }
        
    }
}
class mon{
    private String ma, ten;

    public mon(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }
    
}
class gv{
    private String ma, ten;
    
    public gv(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }
    
    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }
}
class gio{
    private String ma, ten;
    private double g;
    private mon m; 
    private gv gvien; 

    public gio(double g, gv gvien) {
        this.g = g;
        this.gvien = gvien;
    }
    
    @Override
    public String toString(){
        return gvien.getTen()+" "+String.format("%.2f", g);
    }
}