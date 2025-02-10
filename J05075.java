import java.util.*;
import java.io.*;
public class J05075 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine()), n=t;
        List<stu> li=new ArrayList<>();
        while(t-->0){
            li.add(new stu(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        while(n-->0){
            String s=sc.nextLine();
            String id=s.trim().split("\\s+")[0], day=s.trim().split("\\s+")[1];
            for(stu i:li){
                if(i.getId().equals(id)) i.setDays(day);
            }
        }
        String s=sc.nextLine();
        for(stu i:li){
            if(i.getClas().equals(s)) System.out.println(i);
        }
    }
}
class stu{
    private String id, name, clas, note, days; 
    private int score;

    public stu(String id, String name, String clas) {
        this.id = id;
        this.name = name;
        this.clas = clas;
    }

    public String getId() {
        return id;
    }

    public String getClas() {
        return clas;
    }

    public void setDays(String days) {
        this.days = days;
        this.cal();
    }
    
    public void cal(){
        int absent=0, late=0;
        for(char i:days.toCharArray()){
            if(i=='m') late++;
            else if(i=='v') absent++;
        }
        score=10-late*1-absent*2;
        score=Math.max(0, score);
        note="";
        if(score==0) note="KDDK";
    }

    @Override
    public String toString() {
        return id + " " + name + " " + clas + " " + score + " " + note;
    }
}

/*
3
B19DCCN999
Le Cong Minh
D19CQAT02-B
B19DCCN998
Tran Truong Giang
D19CQAT02-B
B19DCCN997
Nguyen Tuan Anh
D19CQCN04-B
B19DCCN998 xxxmxmmvmx
B19DCCN997 xmxmxxxvxx
B19DCCN999 xvxmxmmvvm
D19CQAT02-B
*/