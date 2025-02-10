import java.util.*;
import java.io.*;
import java.text.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int t = Integer.parseInt(sc.nextLine()); // Số lượng sinh viên
        while(t-->0){
            System.out.println(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(),
            Double.parseDouble(sc.nextLine())));
        }
//        for (SinhVien sv : danhSach) {
//            System.out.println(sv);
//        }
    }
}

class SinhVien {
    private String ma, ten, lop;
    private Date ns;
    private double gpa;
    public static int n = 1;
    private SimpleDateFormat dfm = new SimpleDateFormat("dd/MM/yyyy");

    public SinhVien(String ten, String lop, String ns, double gpa) throws ParseException {
        this.ten = sua(ten);
        this.lop = lop;
        this.ns = dfm.parse(ns);
        this.gpa = gpa;
        this.ma = String.format("B20DCCN%03d", n++);
    }

    private String sua(String ten) {
        String[] words = ten.trim().toLowerCase().split("\\s+");
        ten="";
        for(String i:words) ten+=i.substring(0,1).toUpperCase()+i.substring(1)+" ";
        return ten.trim();
    }

//    private String chuanHoaNgaySinh(String ns) {
//        String[] parts = ns.split("/");
//        if (parts[0].length() < 2) parts[0] = "0" + parts[0];
//        if (parts[1].length() < 2) parts[1] = "0" + parts[1];
//        return String.join("/", parts);
//    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " " + dfm.format(ns) + " " + String.format("%.2f", gpa);
    }
}
