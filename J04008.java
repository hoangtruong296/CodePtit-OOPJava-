import java.util.Scanner;
import java.lang.Math;
import java.lang.String;
public class J04008 {
    static class sv{
        String name, code;
        int sal, num, extra;
        int cal(String s, int a){
            String s1=s.substring(0, 2), s2=s.substring(2, 4);
            int b=(int)(s2.charAt(0)-'0')*10+(int)(s2.charAt(1)-'0');
            int c=0;
            this.num=b;
            if(s1!=null && s1.equals("HP")==true) c=900000;
            else if(s1!=null && s1.equals("HT")==true) c=2000000;
            else if(s1!=null && s1.equals("GV")==true) c=500000;
            this.extra=c;
            return a*b+c;
        }
        void in(){
            Scanner sc=new Scanner(System.in);
            String a=sc.nextLine(), b=sc.nextLine();
            int c=sc.nextInt();
            this.code=a;
            this.name=b;
            this.sal=cal(a, c);
        }
        void out(){
            System.out.print(this.code+" "+this.name+" "+this.num+" "+this.extra+" "+this.sal);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        sv one=new sv();
        one.in(); one.out();
    }
}
