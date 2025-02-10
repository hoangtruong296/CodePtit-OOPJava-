import java.util.*;
import java.io.*;
import java.text.*;
import java.util.concurrent.TimeUnit;
public class J07047 {
    public static void main(String[] args) throws FileNotFoundException, ParseException{
        //Scanner sc=new Scanner(new File("DATA.in"));
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        Map<String, phong> mp=new TreeMap<>();
        
        while(t-->0){
            String s=sc.nextLine();
            mp.put(s.charAt(0)+"", new phong(s));
        }
        List<kh> li=new ArrayList<>();
        t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            li.add(new kh(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        for(kh i:li){
            i.setPh(mp.get(i.getMp().charAt(2)+""));
        }
        Collections.sort(li);
        for(kh i:li){
            System.out.println(i);
        }
    }
}
class phong{
    private String loai, ten;
    private double gia, phi;

    public phong(String s) {
        String[] ss=s.split("\\s+");
        this.loai = ss[0];
        this.ten = ss[1];
        this.gia = Double.parseDouble(ss[2]);
        this.phi = Double.parseDouble(ss[3]);
    }

    public String getLoai() {
        return loai;
    }

    public String getTen() {
        return ten;
    }

    public double getGia() {
        return gia;
    }

    public double getPhi() {
        return phi;
    }
    
}
class kh implements Comparable<kh>{
    private String ma, ten, mp;
    private Date den, di;
    private double pay;
    private long days;
    private SimpleDateFormat dfm=new SimpleDateFormat("dd/MM/yyyy");
    private phong ph;
    public static int n=1;
    public kh(String ten, String mp, String den, String di) throws ParseException {
        ma=String.format("KH%02d", n++);
        this.ten = ten;
        this.mp = mp;
        this.den = dfm.parse(den);
        this.di = dfm.parse(di);
        days=TimeUnit.DAYS.convert(this.di.getTime()-this.den.getTime(), TimeUnit.MILLISECONDS);
    }

    public String getMp() {
        return mp;
    }

    public void setPh(phong ph) {
        this.ph = ph;
        if(days>0) pay=(double)days*ph.getGia();
        else pay=ph.getGia();
        pay+=(pay*ph.getPhi());
        if(days>=10 && days<20) pay-=(pay*2/100);
        else if(days<30) pay-=(pay*4/100);
        else if(pay>=30) pay-=(pay*6/100);
    }
    
    @Override
    public String toString(){
        return ma+" "+ten+" "+mp+" "+days+" "+String.format("%.2f", pay);
    }

    @Override
    public int compareTo(kh o) {
        return (int)(o.days-this.days);
    }
    
}
/*
2
C THUONG 150 0.03
B VIP 200 0.05
2
Nguyen Van Hoang
55B1
01/01/2021
05/01/2021
Nguyen Trung Dung
04C6
01/01/2021
10/01/2021

2
C THUONG 150 0.03
B VIP 200 0.05
2
Nguyen Van Hoang
55B1
01/01/2021
01/01/2021
Nguyen Trung Dung
04C6
01/01/2021
10/01/2021
*/