/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachsinhvien1;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

// phai chia 2 file, tao thanh 1 project moi ac

public class SinhVien implements Serializable{
    private String ma, ten, lop;
    private Date ngaysinh;
    private float gpa;

    public SinhVien (int id, String ten, String lop, String ngaysinh , float gpa) {
        ma=String.format("B20DCCN%03d", id+1);
        this.ten = ten;
        this.lop = lop;
        this.gpa = gpa;
        SimpleDateFormat dfm=new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.ngaysinh = dfm.parse(ngaysinh);
        } catch (ParseException ex) {}
    }

    @Override
    public String toString(){
        SimpleDateFormat dfm=new SimpleDateFormat("dd/MM/yyyy");
        return ma+" "+ten+" "+lop+" "+dfm.format(ngaysinh)+" "+String.format("%.2f", gpa);
    }
}
