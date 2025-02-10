import java.util.Scanner;
import java.lang.Math;
import java.math.BigInteger;
import java.lang.String;
public class J03039 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0){
            BigInteger a=sc.nextBigInteger(), b=sc.nextBigInteger();
            if(a.remainder(b).intValue()==0 || b.remainder(a).intValue()==0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
