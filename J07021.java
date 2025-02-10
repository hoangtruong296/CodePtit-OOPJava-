import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.Math;
import java.lang.String;

public class J07021 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc=new Scanner(new File("DATA.in"));
        while(sc.hasNextLine()){
            String s=sc.nextLine();
            if(s.length()>0 && s.equals("END")) break;
            s=s.trim();
            while(s.indexOf(" ")!=s.length() && s.indexOf(" ")>=0){
                int tmp=s.indexOf(" ");
                String a=s.substring(0, tmp);
                System.out.print(a.substring(0, 1).toUpperCase()+a.substring(1, a.length()).toLowerCase()+" ");
                s=s.substring(tmp, s.length());
                s=s.trim();
            }
            System.out.print(s.substring(0, 1).toUpperCase()+s.substring(1, s.length()).toLowerCase()+" ");
            System.out.println();
        }
    }    
}
