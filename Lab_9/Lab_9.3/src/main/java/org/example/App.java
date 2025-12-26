package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App
{
    public static void main(String[] args)
    {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Иванов",   50000, false)); // фиксированная
        employees.add(new Employee(2, "Петров",     350, true));  // почасовая
        employees.add(new Employee(3, "Сидоров",  60000, false));
        employees.add(new Employee(4, "Алексеев",   400, true));
        employees.add(new Employee(5, "Борисов",  45000, false));
        employees.add(new Employee(6, "Гаврилов", 45000, false));
        employees.add(new Employee(7, "Дмитриев",  300, true));

        Report.generateReport(employees);

        Collections.sort(employees, new Comparator<Employee>()
        {
            @Override
            public int compare(Employee e1, Employee e2)
            {
                int result = Double.compare(e2.getMonthlySalary(), e1.getMonthlySalary());
                if (result != 0)
                {
                    return result;
                }
                return e1.getFullName().compareTo(e2.getFullName());
            }
        });

        System.out.println("Полный список (после сортировки):");
        for (Employee e : employees)
        {
            System.out.printf("ID: %d, Имя: %-15s, Среднемесячная: %10.2f%n",
                    e.getId(), e.getFullName(), e.getMonthlySalary());
        }
        System.out.println();

        System.out.println("Первые 5 имён работников:");
        int limit = Math.min(5, employees.size());
        for (int i = 0; i < limit; i++)
        {
            System.out.println(employees.get(i).getFullName());
        }
        System.out.println();

        System.out.println("Последние 3 ID работников:");
        int count = Math.min(3, employees.size());
        for (int i = employees.size() - count; i < employees.size(); i++)
        {
            System.out.println(employees.get(i).getId());
        }
    }
}