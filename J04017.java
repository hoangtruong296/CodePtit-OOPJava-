
package javaapplication1;
import java.util.*;
public class J04017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
             int n = sc.nextInt(), m = sc.nextInt();
             Matrix a = new Matrix(n,m);
             a.nextMatrix(sc);
             Matrix b = a.trans();
             System.out.println(a.mul(b));
        }
    }
}
class Matrix{
    private int n, m;
    private int[][] mtr;
    public Matrix(int n, int m){
        mtr=new int[n][m];
        this.n=n; this.m=m;
    }
    public Matrix(int n, int m, int[][] tmp){
        //mtr=new int[n][m];
        mtr=tmp;
        this.n=n; this.m=m;
    }
    public void nextMatrix(Scanner sc){
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                mtr[i][j]=sc.nextInt();
            }
        } 
    }
    public Matrix trans(){
        int[][] tmp=new int[m][n];
        for(int i=0; i<n; i++) for(int j=0; j<m; j++) tmp[j][i]=mtr[i][j];
        return new Matrix(m, n, tmp);
    }
    public Matrix mul(Matrix b){
        int[][] tmp=b.mtr, sum=new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                int s=0;
                for(int k=0; k<m; k++){
                    s+=mtr[i][k]*tmp[k][j];
                }
                sum[i][j]=s;
            }
        }
        return new Matrix(n, n, sum);
    }
    @Override
    public String toString(){
        String s="";
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                s+=(mtr[i][j]+"")+" ";
            }
            s+="\n";
        }
        return s;
    }
}