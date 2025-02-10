import java.util.*;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;
public class J07051 {
    public static class Cus implements Comparable<Cus>{
        private String id, name, room;
        private Date fir, las;
        private long extr, cost;
        private long days;
        private SimpleDateFormat dfm=new SimpleDateFormat("dd/MM/yyyy");
        public static int n=1;
        
        public void refname(){
            String[] ar=(name.split("\\s+"));
            name="";
            for(String i:ar){
                name+=i.substring(0, 1).toUpperCase()+i.substring(1).toLowerCase();
                name+=" ";
            }
            name=name.trim();
        }
        public Cus(String name, String room, String fir, String las, long extr) throws ParseException{
            this.id=String.format("KH%02d", n++);
            this.name=name.trim().toLowerCase(); refname();
            this.room=room.trim();
            this.fir=dfm.parse(fir.trim());
            this.las=dfm.parse(las.trim());
            this.extr=extr;
            days = TimeUnit.DAYS.convert(this.las.getTime() - this.fir.getTime(), TimeUnit.MILLISECONDS) + 1;

            switch (room.charAt(0)) {
                case '1':
                    cost=25;
                    break;
                case '2':
                    cost=34;
                    break;
                case '3':
                    cost=50;
                    break;
                default:
                    cost=80;
            }
            cost=days*cost+extr;
        }
        @Override
        public int compareTo(Cus o){
            if(o.cost-this.cost>0) return 1;
            else if(o.cost-this.cost==0) return 0;
            return -1;
        }
        @Override
        public String toString(){
            return id+" "+name+" "+room+" "+days+" "+cost;
        }
    }
    public static void main(String[] arg) throws FileNotFoundException, ParseException{
        File data=new File("KHACHHANG.in");
        Scanner sc=new Scanner(data);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<Cus> ar=new ArrayList<>();
        while(t-->0){
            ar.add(new Cus(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(ar);
        for(Cus i:ar) System.out.println(i);
    }
}
