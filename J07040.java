import java.util.*;
import java.io.*;
public class J07040 {
    public static void main(String[] arg) throws FileNotFoundException, IOException, ClassNotFoundException{
        ObjectInputStream data2=new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        File data=new File("VANBAN.in");
        Scanner sc=new Scanner(data);
        ArrayList<String> ar1=new ArrayList<>();
        ArrayList<String> ar2=(ArrayList<String>) data2.readObject();
        while(sc.hasNext()){
            ar1.add(sc.next().toLowerCase());
        }
        Set<String> se2=new TreeSet<>(), se=new TreeSet<>();
        for(String a:ar2){
            se2.addAll(Arrays.asList(a.toLowerCase().split(" ")));
        }
        for(String i:ar1){
            if(!se.contains(i) && se2.contains(i)){
                System.out.println(i);
                se.add(i);
            }
        }
    }
}
