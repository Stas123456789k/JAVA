import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        File inputFile = new File("dates.txt");
        File outputFile = new File("sorted_dates.txt");

        // формат: день.месяц.год
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        try (FileWriter writer = new FileWriter(inputFile))
        {
            writer.write("01.02.2024\n");
            writer.write("31.12.2023\n");
            writer.write("15.05.2020\n");
            writer.write("99.99.9999\n");
            writer.write("10.01.2021\n");

            writer.close();

            System.out.println("Файл " + inputFile.getName() + " создан.");
        } catch (IOException e) {
            System.out.println("Ошибка при создании файла: " + e.getMessage());
            return;
        }

        List<LocalDate> dates = new ArrayList<>();

        try
        {
            Scanner scanner = new Scanner(inputFile);

            while (scanner.hasNextLine())
            {
                String line = scanner.nextLine().trim();

                if (line.isEmpty())
                {
                    continue;
                }

                try
                {
                    LocalDate date = LocalDate.parse(line, formatter);
                    dates.add(date);
                }
                catch (DateTimeParseException e)
                {
                    System.out.println("Неверный формат или значение даты, пропускаем: " + line);
                }
            }

            scanner.close();
        }
        catch (IOException e)
        {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
            return;
        }

        Collections.sort(dates);

        try
        {
            FileWriter writer = new FileWriter(outputFile);

            for (LocalDate date : dates)
            {
                writer.write(date.format(formatter) + "\n");
            }

            writer.close();
        }
        catch (IOException e)
        {
            System.out.println("Ошибка записи выходного файла: " + e.getMessage());
            return;
        }

        System.out.println("Отсортированные даты записаны в файл: " + outputFile.getName());
    }
}