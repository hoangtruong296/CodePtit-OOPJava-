import java.util.Scanner;
import java.lang.String;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
public class J07007 {
    public static void main(String[] args) throws FileNotFoundException{
        File data=new File("VANBAN.in");
        Scanner sc=new Scanner(data);
        String s="";
        HashMap<String, Integer> mp=new HashMap<String, Integer>();
        while(sc.hasNext()){
            s=sc.next();
            s=s.toLowerCase();
            if(mp.containsKey(s)){
                mp.replace(s, 1);
            } else mp.put(s, 1);
            //System.out.println(s);
        }
        ArrayList<String> ar=new ArrayList<String>();
        for(String i:mp.keySet()){
            ar.add(i);
        }
        Collections.sort(ar);
        for(String i:ar) System.out.println(i);
    }
}
