import java.util.*;
public class JKT014 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n], b=new int[n];
            Queue<Integer> q=new LinkedList<>();
            for(int i=0; i<n; i++) a[i]=sc.nextInt();
            b[0]=1;
            q.add(0);
            for(int i=1; i<n; i++){
                if(!q.isEmpty() && a[q.peek()]<=a[i]){
                    b[i]=b[q.peek()]+1;
                    q.add(i);
                } else {
                    b[i]=1;
                    q.add(i);
                }
            }
            for(int i=0; i<n; i++) System.out.print(b[i]+" ");
        }
    }
}
