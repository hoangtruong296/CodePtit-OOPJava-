import java.util.*;
import java.io.*;
public class J07033 {
    public static class stu implements Comparable<stu>{
        String code, name, clas, mail;
        public void remake(){
            String s=name.toLowerCase(), tmp="";
            name="";
            int pos;
            s=s.trim();
            while((pos=s.indexOf(" "))>=0){
                tmp=s.substring(0, pos).toLowerCase();
                s=s.substring(pos, s.length());  s=s.trim();
                name+=tmp.substring(0, 1).toUpperCase()+tmp.substring(1, tmp.length());
                name+=" ";
            }
            name+=s.substring(0, 1).toUpperCase()+s.substring(1, s.length());
        }
        @Override
        public int compareTo(stu a){
            return this.code.compareTo(a.code);
        }
        @Override
        public String toString(){
            return code+" "+name+" "+clas+" "+mail;
        }
    }
    public static void main(String[] arg) throws FileNotFoundException, IOException, ClassNotFoundException{
        File data=new File("SINHVIEN.in");
        Scanner sc=new Scanner(data);
        int t=sc.nextInt(); String tmp=sc.nextLine();
        ArrayList<stu> ar=new ArrayList<>();
        while(t-->0){
            stu a=new stu();
            String s=sc.nextLine();
            a.code=s;
            s=sc.nextLine(); a.name=s; 
            s=sc.nextLine(); a.clas=s;
            s=sc.nextLine(); a.mail=s;
            a.remake();
            ar.add(a);
        }
        Collections.sort(ar);
        for(stu a:ar){
            System.out.println(a);
        }
    }
}
