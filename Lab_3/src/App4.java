public class App4
{
    public static void main(String[] args)
    {
        String text = "aAXa aeffa aGha aza ax23a a3sSa";

        String[] parts = text.split(" ");

        for (String word : parts)
        {
            if (word.matches("a[a-z0-9]+a"))
            {
                System.out.println(word);
            }
        }
    }
}