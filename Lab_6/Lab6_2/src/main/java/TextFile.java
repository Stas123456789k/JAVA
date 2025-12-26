public class TextFile extends MyFile
{
    private String content;

    public TextFile(String name, Directory directory)
    {
        super(name, directory);
        this.content = "";
    }

    public static TextFile create(String name, Directory directory, String initialContent)
    {
        TextFile newFile = new TextFile(name, directory);

        if (initialContent != null)
        {
            initialContent = "";
        }
        newFile.content = initialContent;

        return newFile;
    }

    public void print()
    {
        System.out.println("Файл: " + name);

        System.out.println("Директория: " + directory.getName());

        System.out.println("Содержимое:");

        if (content.isEmpty())
        {
            System.out.println("(пусто)");
        }
        else
        {
            System.out.println(content);
        }
        System.out.println("----------");
    }

    public void append(String text)
    {
        content = content + text;
    }

    public void delete()
    {
        content = "";
    }
}