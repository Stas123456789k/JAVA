package org.example;
import company.*;
import Exceptions.*;

public class App
{
    public static void main(String[] args)
    {
        try
        {
            ShtatnySotrudnik s1 = new ShtatnySotrudnik("Иванов Иван Иванович", "Менеджер", 1200, 300);
            System.out.println("Создан штатный сотрудник: " + s1.getFio());
            System.out.println("Итоговая зарплата: " + s1.rasschitatZarplatu() + "\n");

            KontraktnySotrudnik s2 = new KontraktnySotrudnik("Петров Петр Петрович", "Разработчик", 1800, 12);
            System.out.println("Создан контрактный сотрудник: " + s2.getFio());
            System.out.println("Итоговая зарплата: " + s2.rasschitatZarplatu() + "\n");

            Firma firma = new Firma("");
            System.out.println("Фирма: " + firma.getName());

            Otdel otdel = new Otdel("Разработка", 5);
            System.out.println("Отдел: " + otdel.getName() + ", сотрудников: " + otdel.getEmployeeCount() + "\n");

        } catch (OkladException | PremiyaException e) {
            System.out.println("Ошибка при создании сотрудника: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка ввода данных: " + e.getMessage());
        }



        try {
            Sotrudnik bad1 = new Sotrudnik("Сидоров Сидор Сидорович", "Инженер", -1000);
        } catch (OkladException e) {
            System.out.println("Ошибка (оклад): " + e.getMessage());
        }

        try {
            ShtatnySotrudnik bad2 = new ShtatnySotrudnik("Анна Смирнова", "Бухгалтер", 1500, -200);
        } catch (PremiyaException | OkladException e) {
            System.out.println("Ошибка (премия): " + e.getMessage());
        }

        try {
            Otdel bad3 = new Otdel("", 10);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка (отдел): " + e.getMessage());
        }

        try {
            Firma bad4 = new Firma("   ");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка (фирма): " + e.getMessage());
        }

        try {
            Otdel bad5 = new Otdel("Отдел кадров", -5);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка (количество сотрудников): " + e.getMessage());
        }


    }
}
