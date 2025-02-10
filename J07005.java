import java.io.DataInputStream;
import java.util.Scanner;
import java.lang.String;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.*;
public class J07005 {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        DataInputStream dis=new DataInputStream(new FileInputStream("DATA.IN"));
        int s;
        Map<Integer, Integer> mp=new TreeMap<>();
        for(int j=1; j<=100000; j++){
            s=dis.readInt();
            mp.put(s, mp.getOrDefault(s, 0)+1);
        }
        for(int a:mp.keySet()) System.out.println(a+" "+mp.get(a));
    }
}
