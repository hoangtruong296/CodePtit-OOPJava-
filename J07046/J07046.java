package J07046;
import java.util.*;
import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;
public class J07046 {
    public static class Customer implements Comparable<Customer> {
    private String name, code, id;
    private Date fir;
    private Date las;
    private long days;
    private static int cnt=1;
    public Customer(String name, String code, Date fir, Date las){
        this.id=String.format("KH%02d", cnt++);
        this.name=name;
        this.code=code;
        this.fir=fir;
        this.las=las;
        this.days=las.getTime()-fir.getTime();
        this.days=TimeUnit.DAYS.convert(this.days, TimeUnit.MILLISECONDS);
    }
    
    @Override
    public int compareTo(Customer a){
        int res=(int)(a.days-this.days);
        return res;
    }
    @Override
    public String toString(){
        return id+" "+name+" "+code+" "+days;
    }
}
    public static void main(String[] arg) throws FileNotFoundException, IOException, ClassNotFoundException, ParseException{
        File data=new File("E:\\OOP\\Java\\src\\javaapplication1\\DATA.txt");
        Scanner sc=new Scanner(data);
        DateFormat dfm=new SimpleDateFormat("dd/MM/yyyy");
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<Customer> ar=new ArrayList<>();
        while(t-->0){
            ar.add(new Customer(sc.nextLine(), sc.nextLine(), dfm.parse(sc.nextLine()), dfm.parse(sc.nextLine())));
        }
        Collections.sort(ar);
        for(Customer i:ar) System.out.println(i);
    }
}
