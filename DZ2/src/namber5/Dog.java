package namber5;
import java.lang.Math;
public class Dog
{
    private int[ ]age;
    private String []name;
    public Dog(String[] name, int []age)
    {
        this.name=name;
        this.age=age;
    }


    public int[] DogAge(int x [])
    {
        int[] y=new int[x.length];
        for(int i=0;i<x.length;i++)
        {
            y[i]= (int) (16*Math.log(x[i]));
        }
        return y;
    }

    public String[] toString(String name [], int x[])
    {
        String[] s = new String[name.length + x.length];
        int k=0;
        int m=0;
        for (int i = 0; i < s.length; i++)
        {
            if (i % 2 == 0) {s[i] = name[k];k++;}
            else{s[i] = String.valueOf(x[m]);m++;}
        }
        return s;
    }
}
