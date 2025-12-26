import java.util.Queue;

import java.util.Scanner;

public class App1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введи строку: ");
        String s = scanner.nextLine();

        if (s.length() == 0)
        {
            System.out.println("Строка пустая, последнего символа нет.");
        }
        else
        {
            int lastIndex = s.length() - 1;

            char lastChar = s.charAt(lastIndex);

            System.out.println("Последний символ строки: " + lastChar);
        }
        scanner.close();
    }
}