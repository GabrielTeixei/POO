package aula09.e1;

import java.util.*;

import aula06.exer1.*;
import aula05.E1.DateYMD;



public class ALDemo {
    public static void main(String[] args) {

        ArrayList<Integer> c1 = new ArrayList<>();
        for (int i = 10; i <= 100; i+=10) 
            c1.add(i);
        System.out.println("Size: " + c1.size());

        for (int i = 0; i < c1.size(); i++) 
            System.out.println("Elemento: " + c1.get(i));

        ArrayList<String> c2 = new ArrayList<>();
        
        c2.add("Vento");
        c2.add("Calor");
        c2.add("Frio");
        c2.add("Chuva");
        System.out.println(c2);
        Collections.sort(c2);
        System.out.println(c2);
        c2.remove("Frio"); 
        c2.remove(0);
        System.out.println(c2);

        System.out.println("-------------------");
        System.out.println("Size: " + c2.size());
        System.out.println("Elemento: " + c2.get(0));
        System.out.println("Elemento: " + c2.contains("Vento"));
        System.out.println("Elemento: " + c2.indexOf("Vento"));
        System.out.println("Elemento: " + c2.set(0, "TERRA"));
        System.out.println(c1);
        System.out.println(c2);
        c1.add(12345789);
        c1.remove(5);
        System.out.println(c1);


        c2.add("gaby");
        c2.remove("Chuva");
        System.out.println(c2);

        System.out.println("-------------------");

        Set<Pessoa> c3 = new HashSet<>();

        Pessoa p1 = new Pessoa("aaa",11111,new DateYMD(1, 1, 1223));
        Pessoa p2 = new Pessoa("OLA", 112,new DateYMD(12, 12,1236));

        c3.add(p2);
        c3.add(p1);


        for(Pessoa p : c3){
            System.out.println(p);
        }

        Set<Date> c4 = new TreeSet<>();

        System.out.println("-------------------");

        c4.add(new Date(1-2-2000));
        c4.add(new Date(5-6-2022));
        c4.add(new Date(7-11-1990));
        c4.add(new Date(30-1-2004));
        c4.add(new Date(1-2-2006));

        for(Date d: c4)
            System.out.println(d);
        }
}
