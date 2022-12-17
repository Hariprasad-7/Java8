package org.example;

import java.util.Objects;

public class Employe {

    private int id;
    private String name;
    private double salary;

    Employe(int id, String name, double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
     Employe(){

     }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employe employe)) return false;
        return getId() == employe.getId() && Double.compare(employe.getSalary(), getSalary()) == 0 && Objects.equals(getName(), employe.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getSalary());
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
