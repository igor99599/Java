package namber3;
public class Tester
{
    public static void main(String[] args)
    {
        Circle c=new Circle( 0.0,0.0, 1, 30 );
        Circle [] arr = new Circle[1];
        for (int i=0; i< arr.length; i++)
        {
            arr[i]= c;
            System.out.println(arr[i]);
        }
    }
}
