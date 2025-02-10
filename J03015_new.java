import java.util.Scanner;
import java.math.BigInteger;
public class J03015_new {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        BigInteger a=sc.nextBigInteger(), b=sc.nextBigInteger();
        
        System.out.print(a.subtract(b));
    }
}
