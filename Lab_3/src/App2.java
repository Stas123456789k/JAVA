import java.util.Scanner;

public class App2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введи строку четной длины: ");
        String s = scanner.nextLine();

        if (s.length() % 2 != 0)
        {
            System.out.println("Длина строки должна быть четной!");
        }
        else
        {
            String middle = getMiddleTwo(s);
            System.out.println("Два средних символа: " + middle);
        }

        scanner.close();
    }

    public static String getMiddleTwo(String s)
    {
        int mid = s.length() / 2;
        return s.substring(mid - 1, mid + 1);
    }
}