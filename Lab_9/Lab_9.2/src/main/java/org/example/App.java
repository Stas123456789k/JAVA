package org.example;

import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main(String[] args)
    {
        List<Student> students = new ArrayList<>();

        Student stas = new Student("Стас", 319, 4, 6);
        Student anna = new Student("Анна", 319, 2, 5);
        Student ivan = new Student("Иван", 318, 1, 4);
        Student olga = new Student("Ольга", 320, 1, 4);

        students.add(stas);
        students.add(anna);
        students.add(ivan);
        students.add(olga);

        StudentUtils.processStudents(students);

        System.out.println("Студенты 1 курса:");
        StudentUtils.printStudents(students, 1);

        System.out.println("Студенты 2 курса:");
        StudentUtils.printStudents(students, 2);

        System.out.println("Студенты 3 курса:");
        StudentUtils.printStudents(students, 3);

        System.out.println("Студенты 5 курса:");
        StudentUtils.printStudents(students, 5);
    }
}