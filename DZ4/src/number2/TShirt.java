package number2;

public class TShirt extends Clothes implements MenClothing, WomenClothing
{

    @Override
    public void dressMan() {
        System.out.println("Надели футболку на мужчину");
    }

    @Override
    public void dressWomen() {
        System.out.println("Надели футболку на женщину");
    }
    
    public TShirt(Size size, int price, String color)
    {
        this.size=size;
        this.price=price;
        this.color=color;
    }
}
