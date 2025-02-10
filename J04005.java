import java.util.Scanner;
import java.lang.Math;
import java.lang.String;
public class J04005 {
    static class sv{
        String name, dob;
        float a, b, c;
        void in(){
            Scanner sc=new Scanner(System.in);
            String name=sc.nextLine(), dob=sc.nextLine();
            this.name=name; this.dob=dob;
            float a=sc.nextFloat(), b=sc.nextFloat(), c=sc.nextFloat();
            this.a=a;
            this.b=b;
            this.c=c;
        }
        void out(){
            System.out.print(this.name+" "+this.dob+" ");
            System.out.printf("%.1f", a+b+c);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        sv one=new sv();
        one.in();
        one.out();
    }
}
