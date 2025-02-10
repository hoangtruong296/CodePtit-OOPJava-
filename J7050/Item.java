
package J7050;

public class Item implements Comparable<Item> {
    private String id, cate, name;
    private float buy, sell, prof;
    public static int n=1;
    public Item(String name, String cate, float sell, float buy){
        this.id=String.format("MH%02d", n++);
        this.name=name;
        this.cate=cate;
        this.buy=buy;
        this.sell=sell;
        prof=this.buy-this.sell;
    }
    @Override
    public int compareTo(Item o) {
        if(this.prof>o.prof) return -1;
        if(this.prof==o.prof) return 0;
        return 1;
    }
    @Override
    public String toString(){
        return id+" "+name+" "+cate+" "+String.format("%.2f", prof);
    }    
}
