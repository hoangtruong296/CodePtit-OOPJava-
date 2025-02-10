package javaapplication1.J07017.pack;
import java.util.Scanner;
import java.lang.String;
import java.lang.Math;
import java.io.File;
import java.io.IOException;
public class J07017 {
    public static class Pair<first, second>{
        private first fir;
        private second sec;
        public Pair(first fir, second sec){
            this.fir=fir;
            this.sec=sec;
        }
        public boolean check(int a){
            for(int i=2; i<=Math.sqrt(a); i++){
                if(a%i==0) return false;
            }
            return true;
        }
        public boolean isPrime(){
            return check((Integer)fir) && check((Integer)sec);
        }
        @Override
        public String toString(){
            return String.format("%s %s", this.fir, this.sec);
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}
