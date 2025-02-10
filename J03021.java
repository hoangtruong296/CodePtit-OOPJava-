import java.util.Scanner;
import java.lang.Math;
import java.lang.String;
public class J03021 {
    static String conv(String s){
        s=s.toUpperCase();
        String a="";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='A' || s.charAt(i)=='B' || s.charAt(i)=='C')
                a+='2';
            else if(s.charAt(i)=='D' ||s.charAt(i)=='E' ||s.charAt(i)=='F')
                a+='3';
            else if(s.charAt(i)=='G' ||s.charAt(i)=='H' ||s.charAt(i)=='I')
                a+='4';
            else if(s.charAt(i)=='J' ||s.charAt(i)=='K' ||s.charAt(i)=='L')
                a+='5';
            else if(s.charAt(i)=='M' ||s.charAt(i)=='N' ||s.charAt(i)=='O')
                a+='6';
            else if(s.charAt(i)=='P' ||s.charAt(i)=='Q' ||s.charAt(i)=='R' ||s.charAt(i)=='S')
                a+='7';
            else if(s.charAt(i)=='T' ||s.charAt(i)=='U' ||s.charAt(i)=='V')
                a+='8';
            else if(s.charAt(i)=='W' ||s.charAt(i)=='X' ||s.charAt(i)=='Y' ||s.charAt(i)=='Z')
                a+='9';
        }
        return a;
    }
    static Boolean check(String s){
        int l=0, r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)) return false;
            l++; r--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt(); String a=sc.nextLine();
        while(t--!=0){
            String s=sc.nextLine(), s2;
            s2=conv(s);
            if(check(s2)==true) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
