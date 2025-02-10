
package javaapplication1;
import java.util.*;
import java.io.*;
public class J7012 {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ObjectInputStream data=new ObjectInputStream(new FileInputStream("DATA.in"));
        List<String> li=(ArrayList<String>) data.readObject();
        Map<String, Integer> mp=new TreeMap<>();
        for(String i:li){
            reform(i, mp);
        }
        List<word> wrdli=new ArrayList<>();
        for(String i:mp.keySet()){
            wrdli.add(new word(i, mp.get(i)));
        }
        Collections.sort(wrdli);
        for(word i:wrdli) System.out.println(i);
    }
    static void reform(String s, Map<String, Integer> mp){
        String tmp="";
        s=s.toLowerCase();
        for(int i=0; i<s.length(); i++){
            if((s.charAt(i)<'0' || s.charAt(i)>'9') && (s.charAt(i)<'a' || s.charAt(i)>'z'))
                tmp+=" ";
            else tmp+=s.charAt(i);
        }
        tmp=tmp.trim();
        for(String i:tmp.toLowerCase().split("\\s+")){
            i=i.trim();
            if(i.length()==0) continue;
            if(!mp.containsKey(i)) mp.put(i, 0);
            mp.replace(i, mp.get(i)+1);    
        }
    }
}
class word implements Comparable<word>{
    private String w;
    private int n;

    public word(String w, int n) {
        this.w = w;
        this.n = n;
    }
    
    @Override
    public int compareTo(word o) {
        if(o.n==this.n) return this.w.compareTo(o.w);
        return o.n-this.n;
    }
    
    @Override
    public String toString(){
        return w+" "+n;
    }
}