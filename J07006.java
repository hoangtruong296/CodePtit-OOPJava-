import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;
public class J07006 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
        ObjectInputStream dis=new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> ar=(ArrayList<Integer>) dis.readObject();
        Map<Integer, Integer> mp=new TreeMap<>();
        for(int s:ar){
            mp.put(s, mp.getOrDefault(s, 0)+1);
        }
        for(int a:mp.keySet()) System.out.println(a+" "+mp.get(a));
    }
}
