import java.util.Scanner;
import java.lang.String;
import java.io.File;
import java.io.FileNotFoundException;
public class J07002 {
    public static String conv(long a){
        String s="";
        while(a>0){
            s=(a%10)+s;
            a/=10;
        }
        return s;
    }
    public static long conv2(String s){
        long a=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)<'0' || s.charAt(i)>'9') return 0;
            a=a*10+(long)(s.charAt(i)-'0');
        }
        return a;
    }
//
//
    public static void main(String[] args) throws FileNotFoundException{
        File data=new File("DATA.in");
        Scanner sc=new Scanner(data);
        String s=null;
        long a=1, res=0;
        for(int i=1; i<=32; i++) a*=2;
        a--;
        while(sc.hasNext()){
            s=sc.next();
            if(s.length()>=10 && s.compareTo(conv(a))>0) continue;
            res+=conv2(s);
        }
//        String tmp="4294967296";
//        System.out.println(conv(a));
//        System.out.println(tmp.compareTo(conv(a)));
        System.out.println(res);
    }
}
