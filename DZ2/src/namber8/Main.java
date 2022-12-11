package namber8;
public class Main
{
    public static void main(String[] args)
    {
        String arr[]=new String[]{"a","b","c","d","e","f","g"};
        for(int i=0;i< arr.length/2;i++)
        {
                String k = arr[arr.length - 1 - i];
                arr[arr.length - 1 - i] = arr[i];
                arr[i] = k;
        }
        for(int i=0;i< arr.length;i++) {System.out.print(arr[i] + " ");}
    }
}
