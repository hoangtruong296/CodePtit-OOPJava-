import java.util.Scanner;
import java.lang.Math;
import java.lang.String;
public class J04003 {
    static Long ucln(Long a, Long b){
        if(a==0 || b==0) return a+b;
        return ucln(b, a%b);
    }
    public static class ps{
        Long a, b;
        void in(){
            Scanner sc=new Scanner(System.in);
            Long c=sc.nextLong(), d=sc.nextLong();
            Long tmp=ucln(c, d);
            a=c/tmp; b=d/tmp;
        }
        void out(){
            System.out.print(a+"/"+b);
        }
    }
    public static void main(String[] args) {
        ps ps1=new ps();
        ps1.in();
        ps1.out();
    }
}
