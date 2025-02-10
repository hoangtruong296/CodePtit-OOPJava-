package J07046;
import java.util.concurrent.TimeUnit;
import java.util.Date;
public class Customer implements Comparable<Customer> {
    private String name, code, id;
    private Date fir;
    private Date las;
    private long days;
    private int cnt=1;
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
