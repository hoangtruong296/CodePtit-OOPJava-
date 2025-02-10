import java.util.Scanner;
import java.lang.Math;
import java.lang.String;
public class J04006 {
    static class sv{
        String name, code, dob;
        float a;
        String remake(String s){
            int pos=s.indexOf("/");
            String tmp="", ss="";
            while((pos=s.indexOf("/"))>=0){
                tmp=s.substring(0, pos);
                if(tmp.length()==1) tmp="0"+tmp;
                ss=ss+tmp+"/";
                s=s.substring(pos+1, s.length());
            }
            ss+=s;
            return ss;
        }
        void in(){
            Scanner sc=new Scanner(System.in);
            String name=sc.nextLine(), code=sc.nextLine(), dob=sc.nextLine();
            this.name=name; this.dob=remake(dob); this.code=code;
            float a=sc.nextFloat();
            this.a=a;
        }
        void out(){
            System.out.print("B20DCCN001 "+this.name+" "+this.code+" "+this.dob);
            System.out.printf(" %.2f", a);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        sv one=new sv();
        one.in();
        one.out();
    }
}
