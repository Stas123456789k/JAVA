package com.example;

import com.example.domain.Employee;

public class EmployeeTest
{
    public static void main(String[] args)
    {

        Employee emp = new Employee();

        emp.setEmpId(1);
        emp.setName("Стас Климович");
        emp.setSalary(120.00);
        emp.setSsn("Я не знаю что это");

        System.out.println("Employee ID: " + emp.getEmpId());
        System.out.println("Employee Name: " + emp.getName());
       System.out.println("Employee Ssn: " + emp.getSsn());
        System.out.println("Employee salary: " + emp.getSalary());
    }
}