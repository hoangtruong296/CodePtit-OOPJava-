import java.util.*;
public class J08022 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n+1], b=new int[n+1];
            for(int i=0; i<n; i++) a[i]=sc.nextInt();
            b[n-1]=-1;
            Stack<Integer> st=new Stack<>();
            st.push(a[n-1]);
            for(int i=n-2; i>=0; i--){
                if(!st.empty() && st.peek()>a[i]){
                    b[i]=st.peek(); st.push(a[i]);
                }
                else {
                    while(!st.empty() && st.peek()<=a[i]) st.pop();
                    if(!st.empty()){
                        b[i]=st.peek(); 
                    }
                    else b[i]=-1;
                    st.push(a[i]);
                }
            }
            for(int i=0; i<n; i++) System.out.print(b[i]+" ");
            System.out.println();
        }
    }
}
