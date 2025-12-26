public class App3
{
    public static void main(String[] args)
    {

        Employee[] employees =
                {
                new Employee("Иванов", 50000.0),
                new Employee("Петров", 60500.5),
                new Employee("Сидоров", 72000.75),
                new Employee("Александров", 81000.0)
        };

        Report.generateReport(employees);
    }
}

class Employee
{
    private String fullname;
    private double salary;

    public Employee(String fullname, double salary)
    {
        this.fullname = fullname;
        this.salary = salary;
    }

    public String getFullname()
    {
        return fullname;
    }

    public double getSalary()
    {
        return salary;
    }
}

class Report
{
    public static void generateReport(Employee[] employees)
    {
        System.out.println("Отчёт по зарплатам сотрудников:");
        // System.out.println("--------------------------------");

        for (Employee e : employees)
        {
            System.out.printf("%-15s %10.2f%n", e.getFullname(), e.getSalary());
        }
    }
}