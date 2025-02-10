import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class J07085 {
    public static void check(String s){
        String num="";
        int sum=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                num+=s.charAt(i);
                sum+=(int)(s.charAt(i)-'0');
            }
        }
        int i=0; 
        while(i<num.length() && num.charAt(i)=='0') i++;
        num=num.substring(i);
        System.out.println(num+" "+sum);
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
        ObjectInputStream data=new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> ar=(ArrayList) data.readObject();
        for(String i:ar) check(i);
    }
}
