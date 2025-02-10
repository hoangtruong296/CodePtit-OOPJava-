import java.util.*;
public class J05081 {
    static class Product implements Comparable<Product> {
        public static int n = 1;
        private String id, name, unit;
        private int buy, sell, profit;

        public Product(String name, String unit, int buy, int sell) {
            this.id = "MH" + String.format("%03d", n++);
            this.name = name;
            this.unit = unit;
            this.buy = buy;
            this.sell = sell;
            profit=sell-buy;
        }

        @Override
        public String toString() {
            return id + " " + name + " " + unit + " " + buy + " " + sell + " " + profit;
        }

        @Override
        public int compareTo(Product o) {
           return o.profit-this.profit;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<Product> ar=new ArrayList<>();
        while(t-->0){
            ar.add(new Product(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(ar);
        for(Product i:ar) System.out.println(i);
    }
}
