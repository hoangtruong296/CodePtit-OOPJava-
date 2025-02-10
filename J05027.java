/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
import java.util.*;
public class J05027 {
    public static class gv{
        private String name, code, subj;
        public static int n=1;
        public gv(String name, String subj){
            code=String.format("GV%02d", n++);
            this.name=name;
            this.subj=subj;
            String s[]=subj.split("\\s+");
            this.subj="";
            for(String i:s) this.subj+=i.toUpperCase().charAt(0);
        }
        public String getName() {
            return name;
        }
        @Override
        public String toString(){
            return code+" "+name+" "+subj;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        List<gv> li=new ArrayList<>();
        while(t-->0){
            li.add(new gv(sc.nextLine(), sc.nextLine()));
        }
        t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s=sc.nextLine();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA "+s+":");
            for(gv i:li) if(i.getName().toLowerCase().contains(s.toLowerCase())){
                System.out.println(i);
            }
        }
    }
}
