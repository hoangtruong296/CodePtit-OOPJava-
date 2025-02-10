import java.io.File;
import java.io.IOException;
import java.util.*;
public class J07045 {
    static class LoaiPhong implements Comparable<LoaiPhong>{
        private String icon;
        private String name;
        private String bill;
        private String fee;

        public LoaiPhong(String input) {
            String[] word = input.split(" ");
            ArrayList<String> list = new ArrayList<>(Arrays.asList(word));
            this.icon = list.get(0);
            this.name = list.get(1);
            this.bill = list.get(2);
            this.fee = list.get(3);
        }

        @Override
        public String toString() {
            return icon + " " + name + " " + bill + " " + fee;
        }

        @Override
        public int compareTo(LoaiPhong o) {
            return this.name.compareTo(o.name);
        }
    }
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
}
