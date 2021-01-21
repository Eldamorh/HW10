package com.eldus;

import java.util.*;

public class Main {

    public static <N extends Number> Double sumReturn(List<N> numbers) {
        double sum = 0;
        for(N number : numbers){
            sum += number.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Number> list2 = new ArrayList<>();
        list2.add(1.5);
        list2.add(2.7);
        list2.add(3.3);
        System.out.println(sumReturn(list2));
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
        Comparator<Employee> comparator = new EmployeeBySalaryComparator();
        Collections.sort(list, comparator);
        System.out.println(list);

    }
}
