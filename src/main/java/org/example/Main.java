package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class Main {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ravi","kishore","anushka","virat","chiru","neha");

        //printing list of names with lamda and forEach method
        names.stream().forEach(e->System.out.print(e +","));

        //printing list of names with method reference and forEach method
        names.stream().forEach(System.out::println);
        

        List<Employe> emps = new ArrayList<>();
        emps.add(new Employe(6,"Hari",96016.0));
        emps.add(new Employe(4,"meghana",67300.0));
        emps.add(new Employe(1,"Giri",89000.0));
        emps.add(new Employe(3,"sailesh",24000.0));
        emps.add(new Employe(0,"neha",11000.0));
        emps.add(new Employe(5,"soumaya",817500.0));
        emps.add(new Employe(2,"chaitra",78600.0));

        //Get the highest salary in employee list

        emps.stream().filter(e-> e.getSalary()>100000.0)
                .forEach(e-> System.out.println(e.getName()+" have the highest salary of "+e.getSalary()));
    }
}