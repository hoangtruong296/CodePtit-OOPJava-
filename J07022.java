import java.util.Scanner;
import java.lang.String;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
public class J07022 {
    public static String conv(long a){
        String s="";
        while(a>0){
            s=(a%10)+s;
            a/=10;
        }
        return s;
    }
    public static boolean check(String s){
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)<'0' || s.charAt(i)>'9') return true;
        }
        return false;
    }
    public static void main(String[] args) throws FileNotFoundException{
        File data=new File("E:\\OOP\\JavaApplication1\\src\\javaapplication1\\DATA.txt");
        Scanner sc=new Scanner(data);
        String s=null;
        long a=1;
        for(int i=1; i<=32; i++) a*=2;
        a--;
        ArrayList<String> ar=new ArrayList<>();
        while(sc.hasNext()){
            s=sc.next();
            if(s.length()>10 || (s.length()>=10 && s.compareTo(conv(a))>0) || check(s)) ar.add(s);
        }
        Collections.sort(ar);
        for(String i:ar) System.out.print(i+" ");
    }
}
