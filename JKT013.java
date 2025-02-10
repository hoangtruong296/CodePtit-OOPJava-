import java.util.*;
public class JKT013 {
    public static void lp(String s, ArrayList<String> ar, int n){
        ar.add(s); 
        if(s.length()==n){
            return;
        }
        lp(s+"6", ar, n);
        lp(s+"8", ar, n);
    }
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            ArrayList<String> ar=new ArrayList<>();
            lp("6", ar, n);
            lp("8", ar, n);
            ArrayList<Long> b=new ArrayList<>();
            for(String i:ar) b.add(Long.valueOf(i));
            Collections.sort(b);
            System.out.println(ar.size());
            for(int i=ar.size()-1; i>=0; i--) System.out.print(b.get(i)+" ");
            System.out.println();
        }
    }
}
