package danhsachsinhvien1;
import java.io.ObjectInputStream;
import java.util.*;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main{
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
        ObjectInputStream data=new ObjectInputStream(new FileInputStream("SV.in"));
        ArrayList<SinhVien > li=(ArrayList<SinhVien>) data.readObject();
        for(SinhVien  i:li) System.out.println(i);
    }
    
    
}
