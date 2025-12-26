package org.example;

import java.util.HashMap;
import java.util.Map;

public class App
{
    public static void main(String[] args)
    {
        Map<String, Course> courses = new HashMap<>();

        Course math = new Math("Математика");
        Course history = new History("История");

        courses.put(math.getName(), math);
        courses.put(history.getName(), history);

        for (String courseName : courses.keySet())
        {
            System.out.println(courseName);
        }

        System.out.println(courses);
    }
}
