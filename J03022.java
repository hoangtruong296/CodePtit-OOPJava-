import java.util.*;
public class J03022 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c=1;
        while(sc.hasNext()){
            String s=sc.next(); 
            s=s.trim();
            if(c==1){
                s=s.substring(0, 1).toUpperCase()+s.substring(1).toLowerCase();
                c=0;
            }
            else s=s.toLowerCase();
            
            if(s.contains(".") || s.contains("?") || s.contains("!")){
                c=1;
                s=s.substring(0, s.length()-1);
                System.out.println(s);
            }
            else System.out.print(s+" ");
        }
    }
}
