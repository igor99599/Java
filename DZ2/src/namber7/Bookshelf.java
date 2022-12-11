package namber7;

public class Bookshelf
{
    private String[][]bk;
    private int n;
    public Bookshelf(String[][] bk, int n)
    {
        this.bk=bk;
        this.n=n;
    }
    public String[][] sort(String[][] book)
    {
        boolean isSorted = false;
        while (!isSorted) //пока массив не отсартирован
        {
            isSorted = true; // считаем что отсартирован
            for (int i = 0; i < n-1; i++) {
                for (int j = 0; j < 3; j++) {
                    String k;
                    if (Integer.parseInt(book[i][2]) > Integer.parseInt(book[i + 1][2])) {
                        k = book[i + 1][j];
                        book[i + 1][j] = book[i][j];
                        book[i][j] = k;
                        isSorted = false; // если есть перестановка, то сбрасываем его
                    }
                }
            }
        }
        return book;
    }

    public void min(String[][]book)
    {
        int i=0;
        System.out.println("Самая свежая книга: ");
        for(int j=0;j<3;j++){System.out.print(book[i][j]+" ");}
        System.out.println();
    }

    public void max(String[][]book)
    {
        int i=n;
        System.out.println("Самая раняя книга: ");
        for(int j=0;j<3;j++){System.out.print(book[n-1][j]+" ");}
        System.out.println();
    }
}
