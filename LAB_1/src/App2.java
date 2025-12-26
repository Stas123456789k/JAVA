import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Задание 2");
            System.out.println("1");
            System.out.println("3");
            System.out.println("4");
            System.out.println("6");
            System.out.println("7");
            System.out.println("0");
            System.out.print("Выбор: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    task1(scanner);
                    break;
                case 3:
                    task3(scanner);
                    break;
                case 4:
                    task4(scanner);
                    break;
                case 6:
                    task6(scanner);
                    break;
                case 7:
                    task7(scanner);
                    break;
                case 0:
                    System.out.println("Выход из программы");
                    return;
                default:
                    System.out.println("Такого варианта нет");
            }

            System.out.println();
        }
    }

    // Задание 1 (Проверка делимости)
    private static void task1(Scanner scanner)
    {
        System.out.print("Любое число: ");
        int num = scanner.nextInt();

        System.out.print("Делитель: ");
        int n = scanner.nextInt();

        if (n == 0)
        {
            System.out.println("На 0 делить нельзя");
            return;
        }

        if (num % n == 0)
        {
            System.out.println(num + " делится на " + n + " без остатка.");
        }
        else
        {
            System.out.println(num + " не делится на " + n + ". Остаток = " + (num % n));
        }
    }

    // Задание 3 (День недели или месяц)
    private static void task3(Scanner scanner) {
        System.out.println("Месяц или число");
        System.out.println("1. День (1-7)");
        System.out.println("2. Месяц (1-12)");
        System.out.print("Выбор: ");
        int type = scanner.nextInt();

        if (type == 1) {
            System.out.print("с 1 до 7: ");
            int day = scanner.nextInt();
            String dayName;

            switch (day) {
                case 1:
                    dayName = "Понедельник";
                    break;
                case 2:
                    dayName = "Вторник";
                    break;
                case 3:
                    dayName = "Среда";
                    break;
                case 4:
                    dayName = "Четверг";
                    break;
                case 5:
                    dayName = "Пятница";
                    break;
                case 6:
                    dayName = "Суббота";
                    break;
                case 7:
                    dayName = "Воскресенье";
                    break;
                default:
                    dayName = "Такого дня нету";
            }
            System.out.println("День недели: " + dayName);
        } else if (type == 2) {
            System.out.print("от 1 до 12: ");
            int month = scanner.nextInt();
            String monthName;

            switch (month) {
                case 1:
                    monthName = "Январь";
                    break;
                case 2:
                    monthName = "Февраль";
                    break;
                case 3:
                    monthName = "Март";
                    break;
                case 4:
                    monthName = "Апрель";
                    break;
                case 5:
                    monthName = "Май";
                    break;
                case 6:
                    monthName = "Июнь";
                    break;
                case 7:
                    monthName = "Июль";
                    break;
                case 8:
                    monthName = "Август";
                    break;
                case 9:
                    monthName = "Сентябрь";
                    break;
                case 10:
                    monthName = "Октябрь";
                    break;
                case 11:
                    monthName = "Ноябрь";
                    break;
                case 12:
                    monthName = "Декабрь";
                    break;
                default:
                    monthName = "Такого месяца нету";
            }
            System.out.println("Месяц: " + monthName);
        } else {
            System.out.println("Нужно ввести 1 или 2");
        }
    }

    // Задание 4 (Столица -> страна)
    private static void task4(Scanner scanner) {
        System.out.print("Название столицы: ");
        String city = scanner.nextLine().trim().toLowerCase(); // toLowerCase — чтобы не зависело от регистра

        String country;
        switch (city) {
            case "москва":
                country = "Россия";
                break;
            case "минск":
                country = "Беларусь";
                break;
            case "париж":
                country = "Франция";
                break;
            case "лондон":
                country = "Великобритания";
                break;
            case "афины":
                country = "Греция";
                break;
            case "варшава":
                country = "Польша";
                break;
            case "токио":
                country = "Япония";
                break;
            default:
                country = "Нету";
        }
        System.out.println("Страна: " + country);
    }

    // Задание 6 (Произведение чётных чисел)
    private static void task6(Scanner scanner) {
        System.out.println("Введите n: ");
        int n = scanner.nextInt();

        long product = 1;
        for (int i = 2; i <= n; i += 2) {
            product *= i;
        }

        System.out.println("Произведение чётных чисел до " + n + " = " + product);
    }

    // Задание 7 (Идеальный вес)
    private static void task7(Scanner scanner) {
        System.out.println("Рост (в см): ");
        int height = scanner.nextInt();

        System.out.println("Вес (в кг): ");
        double weight = scanner.nextDouble();

        double normal = height - 100; // идеальный вес
        double min = normal * 0.9;    // нижняя граница нормы (-10%)
        double max = normal * 1.1;    // верхняя граница нормы (+10%)

        System.out.println("Нормальный диапазон веса: от " + min + " до " + max + " кг");

        if (weight < min) {
            System.out.println("Нужно поправиться");
        } else if (weight > max) {
            System.out.println("Нужно похудеть");
        } else {
            System.out.println("Норма");
        }
    }
}
