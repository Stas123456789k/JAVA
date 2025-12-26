package org.example;

public class Student
{
    private String name;
    private int group;
    private int course;
    private int grade;

    public Student(String name, int group, int course, int grade)
    {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grade = grade;
    }

    public String getName()
    {
        return name;
    }

    public int getGroup()
    {
        return group;
    }

    public int getCourse()
    {
        return course;
    }

    public void setCourse(int course)
    {
        this.course = course;
    }

    public int getGrade()
    {
        return grade;
    }

    public double getAverageGrade()
    {
        return grade;
    }
}
