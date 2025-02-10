import java.util.Scanner;
import java.lang.String;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Set;
import java.util.TreeSet;
public class J07030 {
    public static boolean check(int a){
        if(a<2) return false;
        for(int i=2; i<=Math.sqrt(a); i++){
            if(a%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
        ObjectInputStream data=new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> ar=(ArrayList<Integer>) data.readObject();
        Set<Integer> hs1=new TreeSet<Integer>();
        // dung treeset thay vi hashset, hashset la mang bam
        for(int i:ar){
            if(check(i)) hs1.add(i);
        }
        data=new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> ar2=(ArrayList<Integer>) data.readObject();
        Set<Integer> hs2=new TreeSet<Integer>();
        for(int i:ar2){
            if(check(i)) hs2.add(i);
        }
        for(int i:hs1){
            if(i<1000000-i && hs2.contains(1000000-i)){
                System.out.println(i+" "+(1000000-i));
            }
        }
    }
}
