package namber7;
import java.util.Scanner;

public class BookTest
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Введите количество книг");
        int n= in.nextInt();
        String[][]Books=new String[n][3];
        for(int i=0;i<n;i++)
        {
            System.out.println("Введите название книги");
            String name= in.next();
            System.out.println("Введите автора книги");
            String author= in.next();
            System.out.println("Введите дату издания книги");
            String year= in.next();
            Book b=new Book(name,author,year);
            for(int j=0;j<1;j++)
            {
                Books[i][j]=b.getName();
                Books[i][j+1]=b.getAuthor();
                Books[i][j+2]=b.getYear();
            }
        }
        Bookshelf bk=new Bookshelf(Books,n);
        System.out.println("Книжная полка: ");
        for(int i=0;i<n;i++)
        {
            System.out.print("Книга "+(i+1)+": ");
            for(int j=0;j<3;j++) {System.out.print(Books[i][j]+" ");}
            System.out.println();
        }
        String[][] Books_=bk.sort(Books);
        System.out.println("Отсортированная книжная полка: ");
        for(int i=0;i<n;i++)
        {
            System.out.print("Книга "+(i+1)+": ");
            for(int j=0;j<3;j++) {System.out.print(Books_[i][j]+" ");}
            System.out.println();
        }
        bk.min(Books_);
        bk.max(Books_);
    }
}
