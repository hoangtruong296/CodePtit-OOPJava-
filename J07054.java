import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class J07054 {
    public static class stu implements Comparable<stu>{
        private String name, id;
        private float sc1, sc2, sc3, avg;
        private int rank;
        public static int n=1;
        
        public String ref(String s){
            String ss[]=s.trim().toLowerCase().split("\\s+");
            String res="";
            for(String i:ss){
                res+=i.substring(0, 1).toUpperCase()+i.substring(1)+" ";
            }
            return res.trim();
        }
        public stu(String name, float sc1, float sc2, float sc3){
            id=String.format("SV%02d", n++);
            this.name=ref(name);
            this.sc1=sc1; this.sc2=sc2; this.sc3=sc3;
            avg=(sc1*3+sc2*3+sc3*2)/8;
        }
        public float getAvg(){
            return avg;
        }
        public int getRank(){
            return rank;
        }
        public void setRank(int a){
            rank=a;
        }
        @Override
        public int compareTo(stu o) {
            if(o.avg>this.avg) return 1;
            else if(o.avg==this.avg) return this.id.compareTo(o.id);
            return -1;
        }
        @Override
        public String toString(){
            return id+" "+name+" "+String.format("%.2f", avg)+" "+rank;
        }
    }
    
    public static void main(String[] arg) throws FileNotFoundException{
        Scanner sc=new Scanner(new File("BANGDIEM.in"));
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<stu> ar=new ArrayList<>();
        while(t-->0){
            ar.add(new stu(sc.nextLine(), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine())));
        }
        Collections.sort(ar);
        ar.get(0).setRank(1);
        int tmp=1;
        for(int i=1; i<ar.size(); i++){
            if(ar.get(i).getAvg()==ar.get(i-1).getAvg()){
                ar.get(i).setRank(ar.get(i-1).getRank());
                tmp++;
            }
            else{
                ar.get(i).setRank(ar.get(i-1).getRank()+tmp);
                tmp=1;
            }
        }
        for(stu i:ar){
            System.out.println(i);
        }
    }
}
