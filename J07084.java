import java.util.*;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;
public class J07084 {
    public static class stu implements Comparable<stu>{
        private String name;
        private Date fir, las;
        private long onltime;
        
        public stu(String name, Date fir, Date las){
            this.name=name;
            this.fir=fir;
            this.las=las;
            onltime=las.getTime()-fir.getTime();
            onltime=TimeUnit.MINUTES.convert(onltime, TimeUnit.MILLISECONDS);
        }
        @Override
        public int compareTo(stu o) {
            if(o.onltime>this.onltime) return 1;
            else if(o.onltime==this.onltime) return this.name.compareTo(o.name);
            return -1;
        }
        @Override
        public String toString(){
            return name+" "+onltime;
        }
    }
    public static void main(String[] arg) throws FileNotFoundException, ParseException{
        Scanner sc=new Scanner(new File("E:\\OOP\\Java\\src\\javaapplication1\\DATA.txt"));
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<stu> ar=new ArrayList<>();
        SimpleDateFormat dfm=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        while(t-->0){
            ar.add(new stu(sc.nextLine(), dfm.parse(sc.nextLine()), dfm.parse(sc.nextLine())));
        }
        Collections.sort(ar);
        for(stu i:ar) System.out.println(i);
    }
}
