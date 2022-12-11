package namber1;
import java.util.Scanner;
public class TestAuthor {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String emailnew = "Tom1@mail.ru";
        Author a1 = new Author("Tom", "Tom@mail.ru", 'M');
        System.out.println(a1.toString());
        a1.setEmail(emailnew);
        System.out.println("New email: " + a1.getEmail());
    }
}

