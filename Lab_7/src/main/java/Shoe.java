public abstract class Shoe
{
     String s;
     String b;

     public int Size;

    public int getSize ()
    {
        return Size;
    }

        public void setSize(int Size)
        {
            this.Size = Size;
        }


    public Shoe (String s,String b)
    {
        this.s = s;
        setB(b);
    }

    public Shoe() {

    }

    public String getB ()
        {
            return b;
        }

    public void setB(String b)
    {
        this.b = b;
    }

    public abstract void wear();
}
