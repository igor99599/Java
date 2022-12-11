package number3;

public class Toy extends Tovar
{
    String color;
    int minKidAge;
    Toy(String color, int minKidAge, String name, String description, int price)
    {
        this.color= color;
        this.minKidAge = minKidAge;
        this.name=name;
        this.description=description;
        this.price=price;
    }
}
