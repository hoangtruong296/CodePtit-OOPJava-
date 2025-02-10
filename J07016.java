/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
import java.util.*;
import java.io.*;
public class J07016 {
    static boolean check(int a){
        for(int i=2; i<=Math.sqrt(a); i++) if(a%i==0) return false;
        return a>=2;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream data=new ObjectInputStream(new FileInputStream("DATA1.in"));
        int[] dat1=new int[10001], dat2=new int[10001];
        List<Integer> li=(ArrayList<Integer>) data.readObject();
        for(int i:li) if(check(i)) dat1[i]++;
        data.close();
        li.clear();
        data=new ObjectInputStream(new FileInputStream("DATA2.in"));
        li=(ArrayList<Integer>) data.readObject();
        for(int i:li) if(dat1[i]>0 || check(i)) dat2[i]++;
        data.close();
        for(int i=2; i<10000; i++) if(dat1[i]>0 || dat2[i]>0) System.out.println(i+" "+dat1[i]+" "+dat2[i]);
    }
}
