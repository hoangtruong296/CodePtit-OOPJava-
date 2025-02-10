/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
public class J05080 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        List<sub> li=new ArrayList<>();
        while(t-->0){
            li.add(new sub(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(li);
        t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s=sc.nextLine();
            System.out.println("Danh sach cho giang vien "+s+":");
            for(sub i:li) if(i.getTeacher().equals(s)) System.out.println(i);
        }
    }
}
class sub implements Comparable<sub>{
    private String name, id, group, teacher;

    public sub(String id, String name, String group, String teacher) {
        this.name = name;
        this.id = id;
        this.group = group;
        this.teacher = teacher;
    }

    public String getTeacher() {
        return teacher;
    }
    
    @Override
    public int compareTo(sub o) {
        if(this.id.equals(o.id)) return this.group.compareTo(o.group);
        return this.id.compareTo(o.id);
    }
    
    @Override
    public String toString(){
        return id+" "+name+" "+group;
    }
}
/*
4
THCS2D20
Tin hoc co so 2 - D20
01
Nguyen Binh An
CPPD20
Ngon ngu lap trinh C++ - D20
01
Le Van Cong
THCS2D20
Tin hoc co so 2 - D20
02
Nguyen Trung Binh
LTHDTD19
Lap trinh huong doi tuong - D19
01
Nguyen Binh An
1
Nguyen Binh An

*/