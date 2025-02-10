/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
import java.util.*;
public class J08028 {
    static long cal(long[] ar){
        long res=ar[0];
        Stack<Integer> st=new Stack<>();
        for(int i=0; i<ar.length; i++){
            if(st.isEmpty()) st.add(i);
            else {
                if(ar[i]>st.peek()) st.add(i);
                else {
                    while(!st.isEmpty() && ar[i]<=ar[st.peek()]) st.pop();
                    if(!st.isEmpty()) res=Math.max(res, ar[i]*(i-st.peek()));
                    else res=Math.max(res, ar[i]*(i+1));
                    System.out.print(res+" ");
                    st.add(i);
                }
            }
        }
        while(!st.isEmpty()){
            int tmp=st.peek(); st.pop();
            if(!st.isEmpty()) res=Math.max(res, ar[tmp]*(tmp-st.peek()));
            else res=Math.max(res, ar[tmp]*(tmp+1));
        }
        System.out.println();
        return res;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), m=sc.nextInt();
        long[] a=new long[m], b=new long[m];
        for(int i=0; i<m; i++){
            a[i]=sc.nextLong();
            b[i]=n-a[i];
        }
        System.out.println(Math.max(cal(a), cal(b)));
    }
}
// 2 1 3 4 0
// 3 4 2 1 5
