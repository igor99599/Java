package dz1;
import java.util.Scanner;
public class First {

    public static int factorial(int a) // факториал числа
    {
        int f=1;
        for(int i=1;i<=a;i++)
        {
            f=f*i;
        }
        return f;
    }


    public static void main(String[] args)
    {

        //1
        Scanner in=new Scanner(System.in);
        int [] array1;
        array1=new int [5];
        int k=0;
        System.out.println("Введите 5 элементов массива");
        for(int i=0; i< array1.length;i++)
        {
            array1[i]=in.nextInt();
            k+=array1[i];
        }
        System.out.println("Сумма элементов: "+k + ", "+"Среднее арифметическое: "+k/array1.length);

        //2
        int [] array2;
        array2=new int[5];
        System.out.println("Введите 5 элементов массива");
        int z=0;
        while(z<array2.length)
        {
            array2[z]=in.nextInt();
            z++;
        }
        int t=0;
        int s=0;
        do
        {
            s+=array2[t];
            t++;
        }while (t<array2.length);
        System.out.println("Сумма элементов: "+s);
        boolean isSorted=false;
        while(!isSorted) //пока массив не отсартирован
        {
            isSorted=true; // считаем что отсартирован
            for (int j = 0; j < array2.length-1; j++) {
                if (array2[j] > array2[j + 1]) {
                    int h = array2[j];
                    array2[j] = array2[j + 1];
                    array2[j + 1] = h;
                    isSorted = false; // если есть перестановка, то сбрасываем его
                }
            }
        }
        System.out.println("Минимальный элемент массива: "+array2[0]+" Максимальный элемент массива:"+array2[array2.length-1]);

        //3
        System.out.println("Количество аргументов: "+ args.length);
        for (int i=0;i<args.length;i++)
        {
            System.out.println("Аргумент" + i +": "+ args[i]);
        }

        //4
        for (int i=1;i<=10;i++)
        {
            System.out.print("1/"+i+" ");
        }
        System.out.println(" ");

        //5
        System.out.println("Введите целое число");
        int v=in.nextInt();
        System.out.println("Факториал числа: "+ factorial(v));
    }
}
