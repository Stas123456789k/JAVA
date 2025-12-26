package org.example;

import java.util.List;

public class Report
{
    public static void generateReport(List<Employee> employees)
    {
        System.out.println("Отчёт о зарплатах:");
        for (Employee e : employees)
        {
            System.out.printf("%-15s %10.2f%n", e.getFullName(), e.getSalary());
        }
        System.out.println();
    }
}