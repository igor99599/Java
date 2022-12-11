package namber9;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество игроков");
        int n= in.nextInt();
        if(n<9)
        {
            String[] suit=new String[]{"♠️","♥️","♣️","♦️"};
            String[] dignity=new String[]{"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
            ArrayList<String> cards=new ArrayList<>();
            Random generator=new Random();
            while(cards.size()<n*5)
            {
                String card=suit[generator.nextInt(suit.length)]+dignity[generator.nextInt(dignity.length)];
                if(!cards.contains(card)){ cards.add(card);} // если  кардс не содержит подстроки кард, то нет повтора и можно добавить
            }

            for(int i=0;i<n;i++)
            {
                System.out.println("Игрок "+(i+1));
                for(int j=0;j<5;j++)
                {
                    System.out.print(cards.get(5*i+j)+" ");
                }
                System.out.println();
            }
        }
        else{System.out.println("Больше 8 игроков быть не может");}
    }
}
