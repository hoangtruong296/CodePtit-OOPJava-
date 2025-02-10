/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.J07018;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class SinhVien {
    private String ma, ten, lop;    
    private Date ns;
    private float gpa;
    private SimpleDateFormat dfm=new SimpleDateFormat("dd/MM/yyyy");
    public static int n=1;
    public SinhVien(String ten, String lop, String ns, float gpa) throws ParseException {
        this.ten = sua(ten);
        this.lop = lop;
        this.ns = dfm.parse(ns);
        this.gpa = gpa;
        ma=String.format("B20DCCN%03d", n++);
    }
    public String sua(String s){
        String[] ss=s.toLowerCase().split("\\s+");
        s="";
        for(String i:ss) s+=i.substring(0, 1).toUpperCase()+i.substring(1);
        return s.trim();
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+lop+" "+dfm.format(ns)+String.format(" %.2f", gpa);
    }
}
