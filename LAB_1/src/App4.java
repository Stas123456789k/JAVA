import java.util.Scanner;

public class App4
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int x = scanner.nextInt();

        int sum = 0;
        int temp = x;

        while (temp > 0)
        {
            int digit = temp % 10;
            sum = sum + digit;
            temp = temp / 10;
        }

        if (x >= 250 && x <= 400)
        {
            if (sum % 2 == 0)
            {
                System.out.println("Подходит: " + x + " (сумма цифр = " + sum + ")");
            }
            else
            {
                System.out.println("Не подходит: " + x + " (сумма цифр = " + sum + ")");
            }
        }
        else
        {
            System.out.println("Число " + x + " вне диапазона 250–400");
        }

        scanner.close();
    }
}