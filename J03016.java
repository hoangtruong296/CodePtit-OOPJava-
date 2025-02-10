import java.util.*;
import java.math.BigInteger;
public class J03016 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            BigInteger a=new BigInteger(sc.next());
            BigInteger b=a.mod(new BigInteger("11"));
            if(b.compareTo(new BigInteger("0"))==0) System.out.println(1);
            else System.out.println(0);
        }
    }
}
