public class App
{
    public static void main(String[] args)
    {
        Shoe sneakers = new Sneakers();
        Shoe boots = new Boots();
        //Shoe L = new Boots();

        //sneakers.wear();
       // boots.wear();

        Shoe[] shoes = { sneakers, boots };

        for (Shoe shoe : shoes)
        {
            shoe.wear();
        }
    }
}