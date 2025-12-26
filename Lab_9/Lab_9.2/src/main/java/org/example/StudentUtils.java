package org.example;

import java.util.Iterator;
import java.util.List;

public class StudentUtils
{

    public static void processStudents(List<Student> students)
    {
        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext())
        {
            Student s = iterator.next();
            double avg = s.getAverageGrade();

            if (avg < 3.0)
            {
                iterator.remove();
            }
            else
            {
                s.setCourse(s.getCourse() + 1);
            }
        }
    }

    public static void printStudents(List<Student> students, int course)
    {
        for (Student s : students)
        {
            if (s.getCourse() == course)
            {
                System.out.println(s.getName());
            }
        }
    }
}