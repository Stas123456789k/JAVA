package org.example;

class PetSnake
{
    public String name;
    protected int age;
    private double length;

    public PetSnake()
    {
        name = "Безымянная";
        age = 1;
        length = 0.5;
    }

    public PetSnake(String name, int age, double length)
    {
        this.name = name;
        this.age = age;
        this.length = length;
    }

    public void hiss()
    {
        System.out.println(name + " шипит!");
        System.out.println(" ");
    }

    public void printInfo()
    {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Длина: " + length + " м");
        System.out.println();
    }

    public double getLength()
    {
        return length;
    }

    public void setLength(double length)
    {
        this.length = length;
    }
}
