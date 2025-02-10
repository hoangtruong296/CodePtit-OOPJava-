package javaapplication1;
import java.util.*;
public class J05021 {
    public static class sv implements Comparable<sv>{
        private String name, code, clas, mail;
        public sv(String code, String name, String clas, String mail){
            this.name=name; this.code=code; this.clas=clas; this.mail=mail;
        }
        @Override
        public int compareTo(sv o) {
            return this.code.compareTo(o.code);
        }
        @Override
        public String toString(){
            return code+" "+name+" "+clas+" "+mail;
        }
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        List<sv> li=new ArrayList<>();
        while(sc.hasNextLine()){
            li.add(new sv(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(li);
        for(sv i:li) System.out.println(i);
    }
}
