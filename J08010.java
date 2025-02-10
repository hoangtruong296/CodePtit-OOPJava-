/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
import java.util.*;
/**
 *
 * @author ADMIN
 */
public class J08010 {
    static boolean check(String s){
        String a="";
        for(char i:s.toCharArray()) a=i+a; 
        return a.compareTo(s)==0;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int maxx=0;
        List<String> li=new ArrayList<>();
        Map<String, Integer> mp=new TreeMap<>();
        while(sc.hasNext()){
            String s=sc.next();
            if(!check(s)) continue;
            if(maxx<s.length()){
                li.clear();
                li.add(s);
                mp.put(s, 1);
                maxx=s.length();
            }
            else if(maxx==s.length()){
                if(mp.containsKey(s)) mp.replace(s, mp.get(s)+1);
                else{
                    li.add(s);
                    mp.put(s, 1);
                }
            }
        }
        for(String i:li) System.out.println(i+" "+mp.get(i));
    }
}
