package org.example;


public class Main {
    public static void main(String[] args) {

        PetSnake snake1 = new PetSnake();
        snake1.printInfo();
        snake1.hiss();

        PetSnake snake2 = new PetSnake("Гадюка", 3, 1.8);
        snake2.printInfo();
        snake2.hiss();

        snake2.setLength(2.0);
        System.out.println("Новая длина змеи " + snake2.name + ": " + snake2.getLength() + " метра");
    }
}