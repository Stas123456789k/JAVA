package com.example.domain;

public class Electronic extends Product
{
    private int warrantyMonths;

    public Electronic()
    {

    }

    public Electronic(int id, String name, double price, int warrantyMonths)
    { // айди, название, цена, гарантия
        super(id, name, price);
        this.warrantyMonths = warrantyMonths;
    }

    public int getWarrantyMonths()
    {
        return warrantyMonths;
    }

    public void setWarrantyMonths(int warrantyMonths)
    {
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public String getInfo()
    {
        return "Electronic: " +
               "id = " + getId() + ", name = " + getName() + ", price = " + getPrice() + ", warrantyMonths = " + warrantyMonths + '.';
    }
}