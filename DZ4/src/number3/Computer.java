package number3;

public class Computer extends Tovar
{
    String processor;
    String motherBoard;
    Computer(String processor, String motherBoard, String name, String description, int price)
    {
        this.processor=processor;
        this.motherBoard=motherBoard;
        this.name=name;
        this.description=description;
        this.price=price;
    }
}
