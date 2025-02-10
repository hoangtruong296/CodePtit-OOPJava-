/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
import java.util.*;
import java.io.*;
public class J07038 {
    public static class sv implements Comparable<sv>{
        private String ma, ten, lop, mail;
        
        public String format(String s){
            String ss[]=s.toLowerCase().split("\\s+");
            s="";
            for(String i:ss) s+=i.substring(0, 1).toUpperCase()+i.substring(1)+" ";
            return s.trim();
        }
        
        public sv(String ma, String ten, String lop, String mail) {
            this.ma = ma;
            this.ten = format(ten);
            this.lop = lop;
            this.mail = mail;
        }
        
        @Override
        public int compareTo(sv o) {
            return this.ma.compareTo(o.ma);
        }
        
        @Override
        public String toString(){
            return String.format("%s %s %s", ma, ten, lop);
        }
    }
    public static class dn{
        private String ma, ten;
        private int sl;

        public dn(String ma, String ten, int sl) {
            this.ma = ma;
            this.ten = ten;
            this.sl = sl;
        }

        public String getTen() {
            return ten;
        }

        public int getSl() {
            return sl;
        }
        
    }
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc=new Scanner(new File("SINHVIEN.in"));
        Map<String, sv> mpsv=new TreeMap<>();
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s=sc.nextLine();
            mpsv.put(s, new sv(s, sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        sc.close();
        
        sc=new Scanner(new File("DN.in"));
        t=Integer.parseInt(sc.nextLine());
        Map<String, dn> mpdn=new TreeMap<>();
        while(t-->0){
            String s=sc.nextLine();
            mpdn.put(s, new dn(s, sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        sc.close();
        
        sc=new Scanner(new File("THUCTAP.in"));
        t=Integer.parseInt(sc.nextLine());
        Map<String, List<String>> mptt=new TreeMap<>();
        while(t-->0){
            String s=sc.nextLine();
            if(!mptt.containsKey(s.substring(s.indexOf(" ")+1))){
                mptt.put(s.substring(s.indexOf(" ")+1), new ArrayList<>());
            }
            mptt.get(s.substring(s.indexOf(" ")+1)).add(s.substring(0, s.indexOf(" ")));
        }
        t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s=sc.nextLine();
            System.out.println(String.format("DANH SACH THUC TAP TAI %s:", mpdn.get(s).getTen()));
            Collections.sort(mptt.get(s));
            for(int i=0; i<Math.min(mpdn.get(s).getSl(), mptt.get(s).size()); i++){
                System.out.println(mpsv.get(mptt.get(s).get(i)));
            }
        }
        sc.close();
    }
}
