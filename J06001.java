/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
import java.util.*;
public class J06001 {
    public static class sp{
        private String ma, ten;
        private int don1, don2;

        public sp(String ma, String ten, int don1, int don2) {
            this.ma = ma;
            this.ten = ten;
            this.don1 = don1;
            this.don2 = don2;
        }

        public String getMa() {
            return ma;
        }

        public String getTen() {
            return ten;
        }

        public int getDon1() {
            return don1;
        }

        public int getDon2() {
            return don2;
        }
        
    }
    public static class hoadon{
        private String mahd;
        private int sl, tong, giam, tt;
        private sp a;
        public static int n=1;
        
        public hoadon(String s, sp x){
            a=x;
            mahd=s.substring(0, s.indexOf(" "))+String.format("-%03d", n++);
            sl=Integer.parseInt(s.substring(s.indexOf(" ")+1));
            if(mahd.charAt(2)=='1') tong=a.getDon1()*sl;
            else tong=a.getDon2()*sl;
            if(sl>=150) giam=tong/2;
            else if(sl>=100) giam=tong*3/10;
            else if(sl>=50) giam=tong*15/100;
            else giam=0;
            tt=tong-giam;
        }
        
        
        @Override
        public String toString(){
            return mahd+" "+a.getTen()+" "+giam+" "+tt;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        List<hoadon> li=new ArrayList<>();
        Map<String, sp> mp=new TreeMap<>();
        while(t-->0){
            String s=sc.nextLine();
            mp.put(s, new sp(s, sc.nextLine(), Integer.parseInt(sc.nextLine()), 
                Integer.parseInt(sc.nextLine())));
        }
        t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s=sc.nextLine();
            li.add(new hoadon(s, mp.get(s.substring(0, 2))));
        }
        for(hoadon i:li) System.out.println(i);
    }
}
