package number2;

public class Tie extends Clothes implements MenClothing {

    @Override
    public void dressMan() {
        System.out.println("Надели галстук на мужчину");
    }

    public Tie(Size size, int price, String color)
    {
        this.size=size;
        this.price=price;
        this.color=color;
    }
}
