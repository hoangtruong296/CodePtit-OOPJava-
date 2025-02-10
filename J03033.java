import java.math.BigInteger;
import java.util.*;
public class J03033 {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            BigInteger a=new BigInteger(sc.nextLine()), b=new BigInteger(sc.nextLine());
            BigInteger gcd=a.gcd(b);
            BigInteger lcm=(a.multiply(b)).divide(gcd);
            System.out.println(lcm);
        }
    }
}
