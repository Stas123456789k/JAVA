public class App5 {
    public static void main(String[] args) {
        String sentence = "Если есть хвосты по дз, начните с 1 не сданного задания. 123 324 111 4554";

        String[] parts = sentence.split("\\s+");

        for (String word : parts) {
            if (word.matches("\\d+")) {
                if (isPalindrome(word)) {
                    System.out.println("Палиндром-число: " + word);
                }
            }
        }
    }

    public static boolean isPalindrome(String s)
    {
        int i = 0;
        int j = s.length() - 1;

        while (i < j)
        {
            if (s.charAt(i) != s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
