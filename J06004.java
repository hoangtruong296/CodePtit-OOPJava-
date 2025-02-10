/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
import java.util.*;
public class J06004 {
    public static class sv implements Comparable<sv>{
        private String ma, ten, sdt;
        private int nhom;

        public sv(String ma, String ten, String sdt, int nhom) {
            this.ma = ma;
            this.ten = ten;
            this.sdt = sdt;
            this.nhom=nhom;
        }

        public int getNhom() {
            return nhom;
        }
        
        @Override
        public String toString(){
            return String.format("%s %s %s %s", ma, ten, sdt, nhom);
        }

        @Override
        public int compareTo(sv o) {
            return this.ma.compareTo(o.ma);
        }
        
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), m=sc.nextInt();
        String tmp=sc.nextLine();
        List<sv> li=new ArrayList<>();
        while(n-->0){
            li.add(new sv(sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        Map<Integer, String> mp=new TreeMap<>();
        for(int i=1; i<=m; i++){
            mp.put(i, sc.nextLine());
        }
        Collections.sort(li);
        for(sv i:li) System.out.println(i+" "+mp.get(i.getNhom()));
    }
}
