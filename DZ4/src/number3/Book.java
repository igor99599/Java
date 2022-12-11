package number3;

public class Book extends Tovar
{
    String author;
    int age;
    Book (String author, int age, String name, String description, int price)
    {
        this.author = author;
        this.age = age;
        this.name = name;
        this.description = description;
        this.price = price;

    }
}
