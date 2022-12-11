package number7_8_9;

public class Test {
    public static void main(String[] args) {
        Printable[] arr = {new Book("I"), new Book("Not I"), new Magazine("Maybe i?")};
        System.out.println("Books:");
        Book.printMagazines(arr);
        System.out.println();
        System.out.println("Magazines:");
        Magazine.printMagazines(arr);
    }
}
