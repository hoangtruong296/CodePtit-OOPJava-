import java.util.Scanner;
import java.lang.Math;
import java.lang.String;
import java.util.ArrayList;
import java.lang.Comparable;
import java.util.Collections;
public class J05033 {
    public static class time implements Comparable<time>{
        int h, m, s;
        public time(int h, int m, int s){
            this.h=h; this.m=m; this.s=s;
        }
        @Override
        public String toString(){
            return h+" "+m+" "+s;
        }
        @Override
        public int compareTo(time a){
            if(this.h!=a.h) return this.h-a.h;
            if(this.m!=a.m) return this.m-a.m;
            return this.s-a.s;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<time> ar=new ArrayList<time>();
        while(n--!=0){
            ar.add(new time(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(ar);
        for(time i:ar) System.out.println(i);
    }
}
