/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
import java.util.*;
public class J05032 {
    public static class pers implements Comparable<pers>{
        private String name, dob;
        public pers(String s){
            name=s.substring(0, s.indexOf(" ")).trim();
            s=s.substring(s.indexOf(" ")+1);
            dob=s;
            String ss[]=dob.split("/");
            dob=ss[2]+ss[1]+ss[0];
        }
        public String getName() {
            return name;
        }
        @Override
        public String toString(){
            return name;
        }

        @Override
        public int compareTo(pers o) {
            return o.dob.compareTo(this.dob);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        List<pers> li=new ArrayList<>();
        while(t-->0){
            li.add(new pers(sc.nextLine()));
        }
        Collections.sort(li);
        System.out.print(li.get(0)+"\n"+li.get(li.size()-1));
    }
}
