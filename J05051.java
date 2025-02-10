/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
import java.util.*;
public class J05051 {
    public static class bt implements Comparable<bt>{
        private String loai, ma;
        private double hs, cu, moi, tt, pt, tong;
        public static int n=1;
        public bt(String loai, double cu, double moi) {
            ma=String.format("KH%02d", n++);
            this.loai = loai;
            this.cu = cu;
            this.moi = moi;
            if(loai.compareTo("KD")==0) hs=3;
            else if(loai.compareTo("NN")==0) hs=5;
            else if(loai.compareTo("TT")==0) hs=4;
            else hs=2;
            
            tt=(moi-cu)*hs*550;
            if(moi-cu>100) pt=tt;
            else if(moi-cu>=50) pt=tt*35/100;
            else pt=0;
            pt=Math.ceil(pt);
            tong=pt+tt;
        }
        
        @Override
        public int compareTo(bt o) {
            if(o.tong>this.tong) return 1;
            if(o.tong==this.tong) return 0;
            return -1;
        }
        
        @Override
        public String toString(){
            return String.format("%s %d %d %d %d", ma, (int)hs, (int)tt, (int)pt, (int)tong);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        List<bt> li=new ArrayList<>();
        
        while(t-->0){
            li.add(new bt(sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(li);
        for(bt i:li) System.out.println(i);
    }
}
