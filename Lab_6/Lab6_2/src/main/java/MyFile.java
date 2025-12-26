public class MyFile
{
    protected String name;
    protected Directory directory;

    public MyFile(String name, Directory directory)
    {
        this.name = name;
        this.directory = directory;
    }

    public void rename(String newName)
    {
        this.name = newName;
    }

    public String getName()
    {
        return name;
    }

    public Directory getDirectory()
    {
        return directory;
    }
}