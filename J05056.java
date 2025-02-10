/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.*;
import java.util.*;
import java.time.*;
public class J05056 {
    public static class vdv implements Comparable<vdv>{
        private String name, dob, id;
        private DateFormat dfm=new SimpleDateFormat("hh:mm:ss");
        private String sta, end;
        private Long age, time, rank, finl;
        public static int n=1;
        public vdv(String name, String dob, String sta, String end) throws ParseException {
            id=String.format("VDV%02d", n++);
            this.name = name;
            this.dob = dob;
            this.sta = sta;
            this.end = end;
            time=dfm.parse(end).getTime()-dfm.parse(sta).getTime();
            time/=1000; // chuyen tu milisec->second
            age=2021-Long.parseLong(dob.split("/")[2]); // de nam 2021 thi ac
            finl=time-(prio(age));
        }

        public Long getFinl() {
            return finl;
        }

        public void setRank(Long rank) {
            this.rank = rank;
        }
        
        public Long prio(Long age){
            if(age<18) return (long)0;
            if(age<25) return (long)1;
            if(age<32) return (long)2;
            return (long)3;
        }
        public String formTime(Long time){
            Long h=time/3600;
            Long m=(time-h*3600)/60;
            Long s=time-h*3600-m*60;
            return String.format("%02d:%02d:%02d", h, m, s);
        }
        @Override
        public int compareTo(vdv o) {
            return (int)(this.finl-o.finl);
        }
        @Override
        public String toString(){
            return id+" "+name+" "+formTime(time)+" "+formTime(prio(age))+" "+formTime(finl)+" "+rank;
        }
    }   
    public static void main(String[] args) throws ParseException{
            Scanner sc=new Scanner(System.in);
            int t=Integer.parseInt(sc.nextLine());
            List<vdv> li=new ArrayList<>();
            while(t-->0){
                li.add(new vdv(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
            }
            Collections.sort(li);
            long tmp=li.get(0).getFinl();
            long rank=1, dis=0;
            for(vdv i:li){
                if(tmp!=i.getFinl()){
                    tmp=Math.max(tmp, i.getFinl());
                    rank+=dis; dis=1;
                } else dis++; 
                i.setRank(rank);
            }
            for(vdv i:li) System.out.println(i);
        }
}
