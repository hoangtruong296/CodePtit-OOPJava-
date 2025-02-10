package J7050;
import java.util.*;
import java.io.*;

public class J07050 {

    public static void main(String[] arg) throws FileNotFoundException{
        File data=new File("MATHANG.");
        Scanner sc=new Scanner(data);   
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<Item> ar=new ArrayList<>();
        while(t-->0){
            ar.add(new Item(sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine())));
        }
        Collections.sort(ar);
        for(Item i:ar) System.out.println(i);
    }
}
