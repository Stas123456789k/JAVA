package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        File file = new File("me.txt");

        try
        {
            FileWriter writer = new FileWriter(file);
            writer.write("Имя: Стас\n");
            writer.write("Группа: 319\n");
            writer.write("Курс: 4\n");
            writer.write("Хобби: Фотография, чай\n");
            writer.close();
        }
        catch (IOException e)
        {
            System.out.println("Ошибка при записи в файл");
            return;
        }

        System.out.println("Имя файла: " + file.getName());
        System.out.println("Путь: " + file.getAbsolutePath());

        System.out.println("\nСодержимое файла:");
        try
        {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine())
            {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        }
        catch (IOException e)
        {
            System.out.println("Ошибка при чтении файла");
        }
    }
}