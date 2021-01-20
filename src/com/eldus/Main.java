package com.eldus;

import java.util.*;

public class Main {

    public static <N> Number sumReturn(List<Number> numbers) {
        return 0;
    }

    public static void main(String[] args) {
//        List<Number> list = new ArrayList<>();
//        list.add(1.5);
//        list.add(2.7);
//        list.add(3.3);
//        System.out.println(sumReturn(list));
        Employee e1 = new Employee(10, 2500, "Марк");
        Employee e2 = new Employee(2, 5200, "Александр");
        Employee e3 = new Employee(100, 2500, "Алексей");
        Employee e4 = new Employee(1, 4300, "Тарас");


        List<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
        Comparator comparator = new EmployeeBySalaryComparator();
        Collections.sort(list, comparator);
        System.out.println(list);

    }
}
