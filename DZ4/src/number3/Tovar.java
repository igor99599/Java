package number3;

public abstract class Tovar
{
    public String name;
    public int price;
    public String description;

    public String toString()
    {
        return this.name + " | " + this.description + " | " + this.price + " $";
    }
}
