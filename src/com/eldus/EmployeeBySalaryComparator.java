package com.eldus;

import java.util.Comparator;

public class EmployeeBySalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.salary > o2.salary){
            return 1;
        }
        if(o1.salary == o2.salary){
            return o1.name.compareTo(o2.name);
        }
        return -1;
    }
}
