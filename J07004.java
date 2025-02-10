import java.util.Scanner;
import java.lang.String;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
public class J07004 {
    public static void main(String[] args) throws FileNotFoundException{
        File data=new File("DATA.in");
        Scanner sc=new Scanner(data);
        int s;
        HashMap<Integer, Integer> mp=new HashMap<Integer, Integer>();
        while(sc.hasNextInt()){
            s=sc.nextInt();
            if(mp.containsKey(s)){
                int tmp=mp.get(s);
                mp.replace(s, tmp+1);
            } else mp.put(s, 1);
            //System.out.println(s);
        }
        for(int i:mp.keySet()){
            System.out.println(i+" "+mp.get(i));
        }
    }
}
