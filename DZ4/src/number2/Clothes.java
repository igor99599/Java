package number2;
public abstract class Clothes
{
    protected Size size;
    protected int price;
    protected String color;

    public String toString()
    {
        return "Размер: " + size + ", Цвет: " + color + ", Цена: " + price;
    }
}
