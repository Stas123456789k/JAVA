public class App5
{
    public static void main(String[] args) {
        for (int i = 1; i <= 400; i++) {
            int sum = sumDigits(i);
            if (sum % 2 == 0) {
                System.out.print(i + "\t");
            }
        }
    }
            private static int sumDigits(int num)
            {
                int sum = 0;
                while (num > 0) {
                    int digit = num % 10;
                    sum += digit;
                    num /= 10;
                }
                return sum;
            }
        }
