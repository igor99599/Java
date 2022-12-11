package namber10;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Введите строку");
        Scanner in = new Scanner(System.in);
        String line= in.nextLine();
        int k=0;
        if(line.length()!=0){k+=1;}
        for(int i=0;i<line.length();i++)
        {
            if(line.charAt(i)==' '){k++;}

        }
        System.out.println("Количество слов: "+k);
    }
}
