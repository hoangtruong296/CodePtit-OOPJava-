import java.util.Scanner;
import java.lang.Math;
import java.lang.String;
public class J03026 {
    static Boolean check(String a, String b){
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i)!=b.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt(); String a=sc.nextLine();
        while(t--!=0){
            String s=sc.nextLine(), s2=sc.nextLine();
            int res=-1;
            if((s.length()==s2.length() && check(s, s2)==false) || s.length()!=s2.length()) res=Math.max(s.length(), s2.length());
            System.out.println(res);
        }
    }
}
