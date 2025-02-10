import java.util.*;
public class J03023 {
    public static int conv(char a){
        switch(a){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            default:
                return 1000;   
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s=sc.nextLine();
            int maxx=0, res=0;
            for(int i=s.length()-1; i>=0; i--){
                int tmp=conv(s.charAt(i));
                if(maxx==0) res+=tmp;
                else if(maxx>tmp) res-=tmp;
                else if(maxx<=tmp) res+=tmp;
                maxx=Math.max(maxx, tmp);
            }
            System.out.println(res);
        }
    }
}
