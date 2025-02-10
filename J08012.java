import java.util.*;

public class J08012 {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt(), n=t;
        HashMap<Integer, Integer> mp=new HashMap<>();
        while(t-->1){
            int a=sc.nextInt(), b=sc.nextInt();
            if(mp.containsKey(a)) mp.replace(a, mp.get(a)+1);
            else mp.put(a, 1);
            if(mp.containsKey(b)) mp.replace(b, mp.get(b)+1);
            else mp.put(b, 1);
        }
        int a=0, b=0;
        for(int i:mp.keySet()){
            if(mp.get(i)>1) a++;
            if(mp.get(i)==n-1) b++;
        }
        if(a==1 && b==1) System.out.print("Yes");
        else System.out.print("No");
    }
}
