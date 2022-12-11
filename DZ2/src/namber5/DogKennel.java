package namber5;

import java.util.Scanner;

public class DogKennel
{
    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество собак");
        int n=in.nextInt();
        int []age=new int[n];
        String [] name=new String[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Введите кличку собаки");
            name[i]= in.next();
            System.out.println("Введите возраст собаки");
            age[i]=in.nextInt();
        }

        Dog d=new Dog(name,age);
        int [] age_=d.DogAge(age);
        String [] info=d.toString(name,age_);
        for(int i=0;i<info.length;i++){System.out.print(info[i]+" ");}
    }
}
