/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;

public class J05064 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        int ht=0, hp=0;
        while(t-->0){
            Teacher a=new Teacher(sc.nextLine(), sc.nextLine(),
                    Integer.parseInt(sc.nextLine()));
            if(a.getId().contains("HT")){
                if(ht==1) continue;
                ht++;
            }
            else if(a.getId().contains("HP")){
                if(hp==2) continue;
                hp++;
            }
            System.out.println(a);
        }    
    }
}
class Teacher{
    private String name, pos, id;
    private int sal, allow, num;

    public Teacher(String id, String name, int sal) {
        this.name = name;
        this.id = id;
        this.sal = sal;
        num=Integer.parseInt(id.substring(2));
        if(id.substring(0, 2).equals("HT")) allow=2000000;
        else if(id.substring(0, 2).equals("HP")) allow=900000;
        else allow=500000;
        this.sal=sal*num+allow;
    }

    public String getId() {
        return id;
    }
    
    @Override
    public String toString(){
        return String.format("%s %s %d %d %d", id, name, num, allow, sal);
    }
}