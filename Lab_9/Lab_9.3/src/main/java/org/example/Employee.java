package org.example;

public class Employee
{
    private int id;
    private String fullName;
    private double salary;
    private boolean isHourly;

    public Employee(int id, String fullName, double salary, boolean isHourly)
    {
        this.id = id;
        this.fullName = fullName;
        this.salary = salary;
        this.isHourly = isHourly;
    }

    public int getId()
    {
        return id;
    }

    public String getFullName()
    {
        return fullName;
    }

    public double getSalary()
    {
        return salary;
    }

    public boolean isHourly()
    {
        return isHourly;
    }

    public double getMonthlySalary()
    {
        if (!isHourly)
        {
            return salary;
        }
        else
        {
            return salary * 20.8 * 8;
        }
    }
}