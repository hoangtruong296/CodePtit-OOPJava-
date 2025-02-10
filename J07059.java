import java.util.*;
import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;
public class J07059 {
    public static class exam implements Comparable<exam>{
        private SimpleDateFormat dfm=new SimpleDateFormat("dd/MM/yyyy hh:mm");
        private Date date;
        private String id, room, datestr;
        public static int n=1;
        public exam(String day, String hour, String room) throws ParseException{
            datestr=day+" "+hour;
            date=dfm.parse(datestr);
            this.room=room;
            id=String.format("C%03d", n++);
        }
        @Override
        public int compareTo(exam o) {
            if(this.date.getTime()>o.date.getTime()) return 1;
            else if(this.date.getTime()==o.date.getTime()) return this.id.compareTo(o.id);
            return -1;
        }
        @Override
        public String toString(){
            return id+" "+datestr+" "+room;
        }                  
    }  
    public static void main(String[] arg) throws FileNotFoundException, ParseException{
        Scanner sc=new Scanner(new File("CATHI.in"));
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<exam> ar=new ArrayList<>();
        while(t-->0){
            ar.add(new exam(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(ar);
        for(exam i:ar) System.out.println(i);
    }
}
