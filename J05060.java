/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
import java.util.*;
public class J05060 {
    public static class person{
        private String name, dob, id, rank;
        private double sc1, sc2, bonus, total;
        private int age;
        public static int n=1;
        public person(String name, String dob, double sc1, double sc2) {
            this.name = name;
            this.dob = dob;
            this.sc1 = sc1;
            this.sc2 = sc2;
            id=String.format("PH%02d", n++);
            if(sc1>=8 && sc2>=8) bonus=1;
            else if(sc1>=7.5 && sc2>=7.5) bonus=0.5;
            else bonus=0;
            total=bonus+(sc1+sc2)/2;
            total=Math.round(total);
            if(total>10) total=10;
            if(total>=9) rank="Xuat sac";
            else if(total==8) rank="Gioi";
            else if(total==7) rank="Kha";
            else if(total>=5) rank="Trung binh";
            else rank="Truot";
            age=2021-Integer.parseInt(dob.split("/")[2]);
        }
        @Override
        public String toString(){
            return id+" "+name+" "+age+" "+String.format("%.0f", total)+" "+rank;
        }
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            System.out.println(new person(sc.nextLine(), sc.nextLine(), 
                Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        
    }
}
