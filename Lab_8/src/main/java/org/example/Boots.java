package org.example;

public class Boots implements iShoe
{

    @Override
    public void wear()
    {
        System.out.println("Надеваю ботинки — подходят для холодной и дождливой погоды.");
    }
}