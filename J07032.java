import java.util.*;
import java.io.*;
public class J07032 {
    public static boolean check(int a){
        String s=Integer.toString(a);
        if(s.length()<=1 || s.length()%2==0) return false;
        int l=0, r=s.length()-1;
        while(l<=r){
            if((int)(s.charAt(l)-'0')%2==0) return false;
            if(s.charAt(l)!=s.charAt(r)) return false;
            l++; r--;
        }
        return true;
    }
    public static void main(String[] arg) throws FileNotFoundException, IOException, ClassNotFoundException{
        ObjectInputStream data=new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> ar=(ArrayList<Integer>) data.readObject();
        data.close();
        data=new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> ar2=(ArrayList<Integer>) data.readObject();
        data.close();
        Set<Integer> se1=new TreeSet<>(ar), se2=new TreeSet<>(ar2);
        Set<Integer> res=new TreeSet<>();
        for(int i:se1){
            if(check(i) && se2.contains(i)) res.add(i);
            if(res.size()==10) break;
        }
        for(int i:res){
            System.out.println(i+" "+(Collections.frequency(ar, i)+Collections.frequency(ar2, i)));
        }
    }
}
