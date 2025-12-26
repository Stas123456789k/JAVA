package com.example.domain;

public class Product
{
    private int id;
    private String name;
    private double price;
    private int count;

    public Product()
    {

    }

    public int getCount()
    {
        return count;
    }

    public void setCount(int count)
    {
      this.count = count;
    }


    public Product(int id, String name, double price, int count)
    { // айди, название, цена, количество
        this.id = id;
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public String getInfo()
    {
        return "Product id = " + id + ", name = " + name + ", price = " + price + '.';
    }
}