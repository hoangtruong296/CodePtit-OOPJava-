import java.util.*;
public class J08020 {
    public static boolean check(char a, char b){
        if(b==']') return a=='[';
        if(b=='}') return a=='{';
        if(b==')') return a=='(';
        return false;
    }
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s=sc.nextLine();
            ArrayList<Character> ar=new ArrayList<>();
            for(char i:s.toCharArray()){
                if(ar.size()==0) ar.add(i);
                else {
                    int n=ar.size();
                    if(check(ar.get(n-1), i)) ar.remove(n-1);
                    else ar.add(i);
                }
            }
            //for(char i:ar) System.out.print(i);
            if(ar.size()>0) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
