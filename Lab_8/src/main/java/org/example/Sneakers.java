package org.example;

public class Sneakers implements iShoe,iHello //реализует
{

    @Override
    public void wear()
    {
        System.out.println("Надеваю кроссовки — удобно для спорта и повседневной носки.");
    }
    
}