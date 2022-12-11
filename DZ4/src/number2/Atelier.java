package number2;
public class Atelier implements MenClothing, WomenClothing
{
    Clothes tShirt = new TShirt(Size.S, 123, "red");
    Clothes tie = new Tie(Size.M, 321, "black");
    Clothes pants = new Pants(Size.L, 546, "white");
    Clothes skirt = new Skirt(Size.XS, 890, "pink");
    Clothes[] clothes ={tShirt, tie, pants, skirt};

    @Override
    public void dressMan() {
        System.out.println("Men clothes: ");
        for (Clothes cl : clothes)
        {
            if (cl instanceof  MenClothing)
            {
                System.out.println(cl);
            }
        }
    }

    @Override
    public void dressWomen()
    {
        System.out.println("Women clothing: ");
        for (Clothes cl : clothes)
        {
            if (cl instanceof  WomenClothing)
            {
                System.out.println(cl);
            }
        }
    }
}
