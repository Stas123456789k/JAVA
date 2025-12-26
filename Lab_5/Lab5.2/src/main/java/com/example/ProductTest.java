package com.example;

import com.example.domain.*;

public class ProductTest
{
    public static void main(String[] args)
    {
        Product product = new Product (1, "Компьютер", 400.00,1);
        Book book = new Book(1, "Гарри Поттер", 39.99, "Джоан Роулинг", 3);
        FoodProduct food = new FoodProduct(2, "Молоко", 1.49, "2026-01-01");
        Electronic phone = new Electronic(3, "Смартфон", 599.99, 12);
        Clothing tshirt = new Clothing(4, "Футболка", 19.99, "S");

        System.out.println(book.getInfo());
        System.out.println(food.getInfo());
        System.out.println(phone.getInfo());
        System.out.println(tshirt.getInfo());

        product.setCount(2);
    }
}