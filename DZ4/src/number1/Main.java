package number1;
import java.util.Scanner;
public class Main
{


    public static void main(String[] args)
    {
        Seasons S=Seasons.Summer;
        System.out.println(S.getLevels());
        switch (S)
        {
            case Winter:
                System.out.println("Я люблю зиму");
                break;
            case Spring:
                System.out.println("Я люблю весну");
                break;
            case Summer:
                System.out.println("Я люблю лето");
                break;
            case Autumn:
                System.out.println("Я лблю осень");
                break;
        }
        System.out.println("Введите среднюю температуру: ");
        Scanner in = new Scanner(System.in);
        int temp= in.nextInt();
        S.setTempers(temp);
        System.out.println("Теперь средняя температура: "+S.getTempers());
        S.getDescription(S);
        for(Seasons s:Seasons.values()) {System.out.println(s+": Number-"+s.getLevels()+"; Temperature-"+s.getTempers());}
    }
}


