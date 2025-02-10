/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class J07081 {
    public static class sv implements Comparable<sv>{
        private String name, code, clas, mail, name2;
        private String[] str;
        public sv(String code, String name, String clas, String mail){
            this.name=name; this.code=code; this.clas=clas; this.mail=mail;
            str=name.split("\\s+");
            name2=str[str.length-1]+str[0];
            for(int i=1; i<str.length-1; i++) name2+=str[i];
        }
        @Override
        public int compareTo(sv o) {
            if(this.name2.compareTo(o.name2)==0){
                return this.code.compareTo(o.code);
            }
            return this.name2.compareTo(o.name2);
        }
        @Override
        public String toString(){
            return code+" "+name+" "+clas+" "+mail;
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc=new Scanner(new File("SINHVIEN.in"));
        List<sv> li=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            li.add(new sv(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(li);
        for(sv i:li) System.out.println(i);
    }
}
