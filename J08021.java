import java.util.*;
public class J08021 {
    
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s=sc.nextLine();
            ArrayList<Integer> ar=new ArrayList<>();
            int c=0;
            for(int i=0; i<s.length(); i++){
                if(ar.size()==0) ar.add(i);
                else {
                    int n=ar.size();
                    if(s.charAt(ar.get(n-1))=='(' && s.charAt(i)==')'){
                        ar.remove(n-1);
                    } else {
                        ar.add(i);
                    }
                }
            }
            if(ar.size()>0){
                c=s.length()-ar.get(ar.size()-1)-1;
                while(ar.size()>1){
                    int tmp=ar.get(ar.size()-1);
                    ar.remove(ar.size()-1);
                    c=Math.max(c, tmp-ar.get(ar.size()-1)-1);
                }
                c=Math.max(c, ar.get(ar.size()-1));
            } else c=s.length();
            System.out.println(c);
        }
    }
}
