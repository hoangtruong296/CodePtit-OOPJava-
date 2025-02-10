import java.util.*;
import java.io.*;
public class J05078 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        Map<String, String> mp=new TreeMap<>();
        List<empl> li=new ArrayList<>();
        while(t-->0){
            String s=sc.nextLine();
            mp.put(s.split("\\s+")[0], s.substring(s.indexOf(" ")+1));
        }
        t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            li.add(new empl(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        String s=sc.nextLine();
        System.out.println("Bang luong phong "+mp.get(s)+":");
        for(empl i:li){
            if(i.getId().contains(s)) System.out.println(i);
        }
    }
}
class empl{
    private String id, name;
    private int sal, days;
    private long total;

    public empl(String id, String name, int sal, int days) {
        this.id = id;
        this.name = name;
        this.sal = sal;
        this.days = days;
        cal();
    }

    public String getId() {
        return id;
    }
    
    public void cal(){
        int tmp=0;
        int[][] a=new int[4][4];
        int[] b={10, 12, 14, 20, 10, 11, 13, 16, 9, 10, 12 ,14, 8, 9, 11, 13};
        for(int i=0; i<4; i++) for(int j=0; j<4; j++){
            a[i][j]=b[tmp++];
        }
        tmp=id.charAt(0)-'A';
        int c=Integer.parseInt(id.substring(1, 3));
        if(c>0 && c<4) total=(long)(sal*days*a[tmp][0]);
        else if(c<9) total=(long)(sal*days*a[tmp][1]);
        else if(c<16) total=(long)(sal*days*a[tmp][2]);
        else total=(long)(sal*days*a[tmp][3]);
        
    }
    @Override
    public String toString(){
        return id+" "+name+" "+total*1000;
    }
}
/*
2
HC Hanh chinh
KH Ke hoach Dau tu
2
C06HC
Tran Binh Minh
65
25
D03KH
Le Hoa Binh
59
24
KH
*/