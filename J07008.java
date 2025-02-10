import java.util.Scanner;
import java.lang.String;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
public class J07008 {
    public static void sinh(int i, String s, int c, ArrayList<String> ss, ArrayList<Integer> ar){
        for(int j=i+1; j<ar.size(); j++){
            if(s.length()==0) sinh(j, s+" "+ar.get(j), c+1, ss, ar);
            else if(ar.get(j)>ar.get(i)){
                ss.add(s+" "+ar.get(j)); 
                if(c<ar.size()) sinh(j, s+" "+ar.get(j), c+1, ss, ar);
            }
        }
    }
    public static void solve(ArrayList<Integer> ar){
        ArrayList<String> ss=new ArrayList<String>();
        sinh(-1, "", 0, ss, ar);
        Collections.sort(ss);
        for(String i:ss) System.out.println(i);
    }
    public static void main(String[] args) throws FileNotFoundException{
        File data=new File("DAYSO.in");
        Scanner sc=new Scanner(data);
        int a=sc.nextInt();
        ArrayList<Integer> ar=new ArrayList<Integer>();
        while(sc.hasNextInt()){
            a=sc.nextInt();
            ar.add(a);
        }
        solve(ar);
    }
}
