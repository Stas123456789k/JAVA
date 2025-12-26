public class Boots extends Shoe
{

    public Boots(String s, String b) {
        super(s, b);
    }


    public Boots() {
        super();
    }


    @Override
    public void wear()
    {
        System.out.println("Надеваю ботинки: подойдут для холодной погоды.");
    }
}