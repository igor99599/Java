package number3;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static String[] openKatalog (String[] categories)
    {
        int categ = 0;
        String move = "k";
        Scanner scan = new Scanner(System.in);
        int i = 1;
        System.out.println("--------------------------------------------------");
        System.out.println("Katalog:");

        for (String cat: categories)
        {
            System.out.println(i + ". " + cat);
            i++;
        }
        System.out.println("'b': go to bin, 'exit': exit, 'select': select category");
        boolean selected = false;
        while (!selected)
        {
            String input = scan.nextLine();
            if (input.equals("exit"))
            {
                selected = true;
                move = "exit";
            }
            else if (input.equals("b"))
            {
                selected = true;
                move = "b";
            }
            else if(input.equals("select"))
            {
                selected = true;

                boolean sel = false;
                System.out.println("Enter category number: ");
                while (!sel)
                {
                    categ = scan.nextInt();
                    if (categ <= categories.length && categ > 0)
                    {
                        sel = true;
                        move = "t";
                    }
                    else
                        System.out.println("Wrong input");
                }
            }
            else
            {
                System.out.println("Wrong input");
            }
        }

        String[] ret= {move, Integer.toString(categ-1)};
        return ret;
    }
    public static String openBin (ArrayList<Tovar> bin) {
        Scanner scan = new Scanner(System.in);
        int i = 1;
        String move = "b";
        if (bin.size() == 0) {
            System.out.println("Bin is empty");
            move = "k";
        }
        else {
            System.out.println("-------------------------------------------------");
            System.out.println("Your bin: ");
            for (Tovar s: bin) {
                System.out.println(i + ". " + s);
                i++;
            }
            System.out.println("'exit': exit, 'k': go to katalog, 'all': order all");
            boolean selected = false;
            while (!selected) {
                String input = scan.nextLine();
                if (input.equals("exit")) {
                    selected = true;
                    move = "exit";
                }
                else if (input.equals("k")) {
                    selected = true;
                    move = "k";
                }
                else if (input.equals("all")) {
                    selected = true;
                    move = "exit";
                    System.out.println("U will receive your tovars ASAP");
                }
                else {
                    System.out.println("Wrong input");
                }
            }
        }
        return move;
    }
    public static String[] openCategory (Tovar[][] tovars, int selectedCategory) {
        int categ = 0;
        String move = "t";
        Scanner scan = new Scanner(System.in);
        int i = 1;
        for (Tovar t: tovars[selectedCategory]) {
            System.out.println(i + ". " + t);
            i++;
        }
        System.out.println("'b': go to bin, 'k': go to katalog, 'exit': exit, 'select': select tovar");
        boolean selected = false;
        while (!selected) {
            String input = scan.nextLine();
            if (input.equals("exit")) {
                selected = true;
                move = "exit";
            }
            else if (input.equals("b")) {
                selected = true;
                move = "b";
            }
            else if (input.equals("k")) {
                selected = true;
                move = "k";
            }
            else if(input.equals("select")) {
                selected = true;

                boolean sel = false;
                System.out.println("Enter tovar number: ");
                while (!sel) {
                    categ = scan.nextInt();
                    if (categ <= tovars[selectedCategory].length && categ > 0) {
                        sel = true;
                        move = "k";
                        System.out.println("Tovar " + tovars[selectedCategory][categ-1] + " was moved to your bin");
                    }
                    else
                        System.out.println("Wrong input");
                }
            }
            else {
                System.out.println("Wrong input");
            }
        }
        String[] ret = {move, Integer.toString(categ - 1)};
        return ret;
    }
    public static void login (String[][] usersData) {
        Scanner scan = new Scanner(System.in);
        boolean login = false;
        System.out.println("Let's login!");
        while (!login) {
            System.out.println("Enter username: ");
            String usernameEnter = scan.nextLine();
            if (usernameEnter.equals("exit"))
                System.exit(0);
            for (String[] s : usersData) {
                if (usernameEnter.equals(s[0]))
                    login = true;
            }
            if (!login)
                System.out.println("Username doesn't exist");
        }

        login = false;

        while (!login) {
            System.out.println("Password: ");
            String passwordEnter = scan.nextLine();
            if (passwordEnter.equals("exit"))
                System.exit(0);
            for (String[] s : usersData) {
                if (passwordEnter.equals(s[1]))
                    login = true;
            }
            if (!login)
                System.out.println("Wrong password");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int selectedCategory = 0;
        ArrayList<Tovar> bin = new ArrayList<>();
        String[] categories = {"Computers", "Books", "Toys"};
        Tovar[][] tovars = {
                {new Computer("i7", "acer", "Super Computer", "it s fast", 10000),
                        new Computer("i5", "asus", "Powerful", "it s very fast", 20000),
                },
                {new Book("Pushkin", 1836, "Captain's Daughter", "Novel", 500),
                        new Book("Gogol", 1842, "Dead souls", "Novel", 400),
                },
                {new Toy("red", 12, "Bob", "Bob is funny", 123),
                        new Toy("yellow", 8, "John", "john is smart", 321)}
        };

        String[][] usersData = {{"useruser", "qwerty"},
                {"user2", "ytrewq"},
                {"someGuy", "456"}};

        login(usersData);
        System.out.println("U logged in!");

        String move = "k";
        while (!move.equals("exit")) {
            switch (move) {
                case "k" -> {
                    String[] katalog = openKatalog(categories);
                    move = katalog[0];
                    if (Integer.parseInt(katalog[1]) >= 0)
                        selectedCategory = Integer.parseInt(katalog[1]);
                }
                case "b" -> move = openBin(bin);
                case "t" -> {
                    System.out.println("--------------------------------------------------");
                    System.out.println(categories[selectedCategory] + ":");
                    String[] res = openCategory(tovars, selectedCategory);
                    move = res[0];
                    if (Integer.parseInt(res[1]) >= 0)
                        bin.add(tovars[selectedCategory][Integer.parseInt(res[1])]);
                }
                default -> move = "exit";
            }
        }
    }
}
