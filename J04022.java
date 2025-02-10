import java.util.*;
public class J04022 {
    static class WordSet{
        private String data;
        public WordSet(String s){
            data=s;
        }
        public String union(WordSet a){
            Set<String> se=new TreeSet<>();
            String[] s=this.data.toLowerCase().split("\\s+");
            String[] ss=a.data.toLowerCase().split("\\s+");
            se.addAll(Arrays.asList(s));
            se.addAll(Arrays.asList(ss));
            String res="";
            for(String tmp:se) res+=tmp+" ";
            return res;
        }
        public String intersection(WordSet b){
            Set<String> se=new TreeSet<>();
            String[] s=this.data.toLowerCase().split("\\s+");
            String[] ss=b.data.toLowerCase().split("\\s+");
            ArrayList<String> ar=new ArrayList<>();
            for(String tmp:ss) ar.add(tmp);
            for(String tmp:s) if(ar.contains(tmp)) se.add(tmp);
            String res="";
            for(String tmp:se) res+=tmp+" ";
            return res;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
