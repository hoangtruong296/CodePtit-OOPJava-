import java.util.*;
public class J04018 {
    static class sp{
        private int a, b;
        public sp(int a, int b){
            this.a=a; this.b=b;
        }
        public sp cong(sp o){
            int c=this.a+o.a, d=this.b+o.b;
            return new sp(c, d);
        }
        public sp nhan(sp o){
            int c=this.a*o.a-this.b*o.b, d=this.a*o.b+this.b*o.a;
            return new sp(c, d);
        }
        @Override
        public String toString(){
            return a+" + "+b+"i";
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt(), d=sc.nextInt();    
            sp sp1=new sp(a, b), sp2=new sp(c, d);
            System.out.println(sp1.cong(sp2).nhan(sp1)+", "+sp1.cong(sp2).nhan(sp1.cong(sp2)));
        }        
    }
}
