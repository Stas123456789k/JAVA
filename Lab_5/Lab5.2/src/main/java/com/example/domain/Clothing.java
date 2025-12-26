package com.example.domain;

public class Clothing extends Product
{
    private String size;

    public Clothing()
    {

    }

    public Clothing(int id, String name, double price, String size)
    { // айди, название, цена, размер
        super(id, name, price);
        this.size = size;
    }

    public String getSize()
    {
        return size;
    }

    public void setSize(String size)
    {
        this.size = size;
    }

    @Override
    public String getInfo() {
        return "Clothing: " +
                "id = " + getId() + ", name = " + getName() + ", price = " + getPrice() + ", size = " + size + '.';
    }
}