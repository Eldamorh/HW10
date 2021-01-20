package com.eldus;

public class Employee implements Comparable<Employee>{

    int id;
    int salary;
    String name;


    public Employee(int id,int salary, String name){
        this.id = id;
        this.salary = salary;
        this.name = name;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        if(this.id > o.id){
            return 1;
        }
        if(this.id == o.id){
            return 0;
        }
        return -1;
    }
}
