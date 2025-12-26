import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class App2
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);

        File file = new File("temp.txt");
        Scanner in = new Scanner(System.in);

        try
        {
            FileWriter writer = new FileWriter(file);
            System.out.println("Введите 15 значений температуры (через пробел или с новой строки):");

            for (int i = 0; i < 5; i++)
            {
                double t = in.nextDouble();
                writer.write(t + "\n");
            }

            writer.close();
        }
        catch (IOException e)
        {
            System.out.println("Ошибка записи");
            return;
        }

        double sum = 0;
        int count = 0;

        try
        {
            Scanner fileScanner = new Scanner(file);
            fileScanner.useLocale(Locale.US); // тоже важно

            while (fileScanner.hasNextDouble())
            {
                double t = fileScanner.nextDouble();
                sum += t;
                count++;
            }

            fileScanner.close();
        }
        catch (IOException e)
        {
            System.out.println("Ошибка чтения");
            return;
        }

        System.out.println("sum = " + sum);
        System.out.println("count = " + count);

        double avg = sum / count;
        System.out.println("Средняя температура: " + avg);
    }
}