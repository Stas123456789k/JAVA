package com.example.domain;

public class FoodProduct extends Product
{
    private String expirationDate;

    public FoodProduct()
    {

    }

    public FoodProduct(int id, String name, double price, String expirationDate)
    { //айди, название, цена, срок годности
        super(id, name, price);
        this.expirationDate = expirationDate;
    }

    public String getExpirationDate()
    {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate)
    {
        this.expirationDate = expirationDate;
    }

    @Override
    public String getInfo()
    {
        return "FoodProduct: " +
               "id = " + getId() + ", name = " + getName() + ", price = " + getPrice() + ", expirationDate = " + expirationDate + '.';
    }
}