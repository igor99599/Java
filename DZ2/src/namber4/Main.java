package namber4;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество компьютеров в магазине");
        int n=in.nextInt();
        System.out.println("Введите набор из "+n+" чисел, которые характеризуют обьем памяти в компьютерах");
        Integer [] list=new Integer [n];
        for(int i=0; i<list.length; i++)
        {
                list[i]= in.nextInt();
        }

        System.out.println("Добавьте элемент");
        int x1= in.nextInt();
        Shop s1=new Shop(list,x1);
        Integer[] newlist1= s1.add(list, x1);
        System.out.println("Новый каталог: ");
        for(int i=0; i<newlist1.length;i++){System.out.print(newlist1[i]+" ");}

        System.out.println("\n"+"Удалите элемент");
        int x2= in.nextInt();
        Shop s2=new Shop(newlist1,x2);
        Integer[] newlist2=s2.delete(newlist1,x2);
        System.out.println("Новый каталог: ");
        for(int i=0; i<newlist2.length;i++){System.out.print(newlist2[i]+" ");}

        System.out.println("\n"+"Введите необходимое значение памяти, которое нужно найти");
        int x3= in.nextInt();
        Shop s3=new Shop(newlist2,x3);
        s3.search(newlist2,x3);
    }
}
