/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
import java.util.*;

public class J05038 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        int sum=0;
        while(t-->0){
            salaryTab a=new salaryTab(sc.nextLine(), Integer.parseInt(sc.nextLine()), 
                    Integer.parseInt(sc.nextLine()), sc.nextLine());
            System.out.println(a);
            sum+=a.getTotal();
        }    
        System.out.println("Tong chi phi tien luong: "+sum);
    }
    
}
class salaryTab{
    private String name, pos, id;
    private int days, daySal, sal, bonus, allowance, total;
    public static int n=1;

    public salaryTab(String name, int daySal, int days, String pos) {
        this.name = name;
        this.pos = pos;
        this.days = days;
        this.daySal = daySal;
        id=String.format("NV%02d", n++);
        if(pos.equals("GD")) allowance=250000;
        else if(pos.equals("PGD")) allowance=200000;
        else if(pos.equals("TP")) allowance=180000;
        else if(pos.equals("NV")) allowance=150000;
        sal=days*daySal;
        if(days>=25) bonus=sal*2/10;
        else if(days>=22) bonus=sal/10;
        else bonus=0;
        total=sal+bonus+allowance;
    }

    public int getTotal() {
        return total;
    }
    
    @Override
    public String toString(){
        return String.format("%s %s %s %s %s %s", id, name, sal, bonus, allowance, total);
    }
    
}