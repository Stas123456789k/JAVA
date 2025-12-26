package com.example.domain;

public class Book extends Product
{
    private String author;

    public Book()
    {

    }

    public Book(int id, String name, double price, String author, int count)
    { // айди, название, цена, автор
        super(id, name, price, count);
        this.author = author;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    @Override
    public String getInfo()
    {
        super.getInfo();

        return "Book: " +
              "id = " + getId() + ", name = " + getName() + ", price = " + getPrice() + ", author = " + author + '.';
    }
}