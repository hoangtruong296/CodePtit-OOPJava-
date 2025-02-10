/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
import java.util.*;
public class J05070 {
    public static class clb{
        private String id, name;
        private int ticket;

        public clb(String id, String name, int ticket) {
            this.id = id;
            this.name = name;
            this.ticket = ticket;
        }
        
    }
    public static class match implements Comparable<match>{
        private String id;
        private int quan, revenue;
        private clb mclb;

        public match(String id, int quan, clb mclb) {
            this.id = id;
            this.quan = quan;
            this.mclb=mclb;
            revenue=mclb.ticket*quan;
        }

        @Override
        public int compareTo(match o) {
            if(o.revenue==this.revenue) return this.mclb.name.compareTo(o.mclb.name);
            return o.revenue-this.revenue;
        }
        
        @Override
        public String toString(){
            return id+" "+mclb.name+" "+revenue;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        Map<String, clb> mp=new TreeMap<>();
        
        while(t-->0){
            String s=sc.nextLine();
            clb a=new clb(s, sc.nextLine(), Integer.parseInt(sc.nextLine()));
            mp.put(s, a);
        }
        
        t=Integer.parseInt(sc.nextLine());
        List<match> li=new ArrayList<>();
        while(t-->0){
            String s=sc.next();
            li.add(new match(s, sc.nextInt(), mp.get(s.substring(1, 3))));
        }
        Collections.sort(li);
        for(match i:li) System.out.println(i);
    }
}
