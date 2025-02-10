import java.util.Scanner;
import java.lang.String;
import java.io.File;
import java.io.FileNotFoundException;

public class J07001 {
    public static void main(String[] args) throws FileNotFoundException{
        File data=new File("DATA.in");
        Scanner sc=new Scanner(data);
        String s=null;
        while(sc.hasNextLine()){
            s=sc.nextLine();
            System.out.println(s);
        }
    }
}
