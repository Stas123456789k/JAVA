public class Main
{
    public static void main(String[] args)
    {
        Directory dir = new Directory("Документы");

        TextFile file = TextFile.create("test.txt", dir, "ту-ту-ту.\n");

        file.print();

        file.append("пам-пам-пам.\n");

        file.print();

        file.rename("new_test.txt");

        file.print();

        file.delete();

        file.print();
    }
}