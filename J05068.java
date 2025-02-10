/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
import java.util.*;
public class J05068 {
    public static class item implements Comparable<item>{
        private String id, brand;
        private long quan, cost, tax, bill;

        public item(String id, long quan) {
            this.id = id;
            this.quan=quan;
            if(id.charAt(0)=='X'){
                cost=128000;
                tax=quan*cost*3/100;
            }
            else if(id.charAt(0)=='D'){
                cost=11200;
                tax=quan*cost*35/1000;
            }
            else if(id.charAt(0)=='N'){
                cost=9700;
                tax=quan*cost*2/100;
            }
            bill=quan*cost+tax;
            String tmp=id.substring(id.length()-2);
            if(tmp.compareTo("BP")==0) brand="British Petro";
            else if(tmp.compareTo("ES")==0) brand="Esso";
            else if(tmp.compareTo("SH")==0) brand="Shell";
            else if(tmp.compareTo("CA")==0) brand="Castrol";
            else if(tmp.compareTo("MO")==0) brand="Mobil";
            else{
                brand="Trong Nuoc";
                bill-=tax;
                tax=0;
            }
        }

        @Override
        public int compareTo(item o) {
            if(o.bill>this.bill) return 1;
            if(o.bill==this.bill) return 0;
            return -1;
        }
        
        @Override
        public String toString(){
            return id+" "+brand+" "+cost+" "+tax+" "+bill;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        List<item> li=new ArrayList<>();
        
        while(t-->0){
            String s=sc.nextLine();
            li.add(new item(s.split("\\s+")[0], Long.parseLong(s.split("\\s+")[1])));
        }
        Collections.sort(li);
        for(item i:li) System.out.println(i);
    }
}
