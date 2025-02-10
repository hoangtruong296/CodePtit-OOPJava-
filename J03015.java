import java.util.Scanner;
import java.lang.Math;
import java.lang.String;

public class J03015 {
    static String newStr(String s){
        if(s.length()==0) return "";
        while(s.length()>0 && s.charAt(0)=='0'){
            s=s.substring(1, s.length());
        }
        return s;
    }
    static void cal(int[] a, int[] b, int c){
        int r=0;
        for(int i=a.length-1; i>=0; i--){
            int tmp=a[i]-b[i]-r;
            if(tmp<0 && i!=0){
                tmp+=10; r=1;
            } else r=0;
            a[i]=tmp;
        }
        int i=0; 
        while(i<a.length && a[i]==0) i++;
        if(i==a.length) System.out.print(0);
        else {
            if(c==-1) System.out.print('-');
            for(; i<a.length; i++){
               System.out.print(a[i]);
            }   
        }
    }
    static void solve(String a, String b){
        a=newStr(a); b=newStr(b);
//        System.out.println(a);
//        System.out.println(b);
        while(a.length()!=b.length()){
            if(a.length()<b.length()) a='0'+a;
            else if(b.length()<a.length()) b='0'+b;
        }
        int[] ar=new int[Math.max(a.length(), b.length())], br=new int[Math.max(a.length(), b.length())];
        for(int j=a.length()-1; j>=0; j--){
            ar[j]=(int)a.charAt(j)-'0';
            br[j]=(int)b.charAt(j)-'0';
        }
        int i=0, c=1;
        while(i<a.length()){
            if(ar[i]==br[i]) i++;
            else if(ar[i]>br[i]){
                cal(ar, br, c);
                break;
            }
            else if(ar[i]<br[i]){
                c=-1;
                cal(br, ar, c); break;
            }
        }
        if(i==a.length()) cal(ar, br, c);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine(), b=sc.nextLine();
        solve(a, b);
    }
}
