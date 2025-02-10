import java.util.*;
public class J04020 {
    public static class Pair<f, s>{
        private f first;
        private s second;
        public Pair(f first, s second){
            this.first=first;
            this.second=second;
        }
        public boolean check(int a){
            for(int i=2; i<=Math.sqrt(a); i++) if(a%i==0) return false;
            return true;
        }
        public boolean isPrime(){
            return check((Integer)first) && check((Integer)second);
        }
        @Override
        public String toString(){
            return first+" "+second;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
