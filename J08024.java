import java.util.*;
import java.math.BigInteger;
public class J08024 {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s=sc.nextLine();
            BigInteger a=new BigInteger(s);
            Queue<BigInteger> st=new LinkedList<>();
            st.add(new BigInteger("9"));
            while(st.size()>0){
                BigInteger tmp=st.peek();
                st.remove(st.peek());
                if(tmp.mod(a).compareTo(new BigInteger("0"))==0){
                    System.out.println(tmp);
                    break;
                }
                st.add(new BigInteger(tmp+"0"));
                st.add(new BigInteger(tmp+"9"));
            }
        }
    }
}
