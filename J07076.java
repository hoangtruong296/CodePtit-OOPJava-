import java.util.*;
import java.io.*;
public class J07076 {
    public static void Sort(int[][] ar, int n, int p){
        ArrayList<Integer> li=new ArrayList<>();
        for(int i=0; i<n; i++) li.add(ar[i][p]);
        Collections.sort(li);
        for(int i=0; i<n; i++) ar[i][p]=li.get(i);
    }
    public static void main(String[] arg) throws FileNotFoundException{
        Scanner sc=new Scanner(new File("E:\\OOP\\Java\\src\\javaapplication1\\DATA.txt"));
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(), m=sc.nextInt(), p=sc.nextInt();
            int[][] ar=new int[n+1][m+1];
            for(int i=0; i<n; i++) for(int j=0; j<m; j++) ar[i][j]=sc.nextInt();
            Sort(ar, n, p-1);
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++) System.out.print(ar[i][j]+" ");
                System.out.println();
            }
        }
    }
}
