import java.util.*;
import java.io.*;
public class J03025 {
    public static boolean check(String s){
        int l=0, r=s.length()-1;
        int c=0;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)) c++;
            l++; r--;
        }
        if(s.length()%2==0 && c==1) return true;
        if(s.length()%2!=0 && c<=1) return true;
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            if(check(sc.nextLine())) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
