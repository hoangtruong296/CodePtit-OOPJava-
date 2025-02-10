import java.util.*;
public class J03017 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s=sc.next();
            Stack<Integer> st=new Stack<>();
            int res=0;
            for(int i=0; i<s.length(); i++){
                if(st.size()<2) st.add(i);
                else {
                    if(s.charAt(i)=='0' && s.charAt(st.elementAt(st.size()-1))=='0' && s.charAt(st.elementAt(st.size()-2))=='1'){
                        st.pop(); st.pop();
                        res=3;
                    }
                    else st.push(i);
                }
            }
            if(st.isEmpty()) res=s.length();
            else{
                res=Math.max(res, s.length()-st.lastElement()-1);
                while(st.size()>=2){
                    //System.out.println(st.lastElement()+" "+st.elementAt(st.size()-2));
                    res=Math.max(res, st.lastElement()-st.elementAt(st.size()-2)-1);                    
                    st.pop();
                }
                if(st.size()==1) res=Math.max(res, st.lastElement()-1);
            }
            System.out.println(res);
        }
    }
}