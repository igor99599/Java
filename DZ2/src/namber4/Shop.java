package namber4;

import java.util.ArrayList;
import java.util.List;

public class Shop
{
    private Integer[] arr;
    private int x;
    public Shop (Integer[] arr, int x) //Конструктор
    {
        this.arr=arr;
        this.x=x;
    }

    public static Integer[] add(Integer[] arr, int x) //Добавление
    {
        List<Integer> arrlist=new ArrayList();
        for(Integer al: arr) { arrlist.add(al);}
        arrlist.add(x);
        Integer [] array=new Integer[arrlist.size()];
        Integer [] array_=arrlist.toArray(array);
        return array_;
    }

    public static Integer[] delete(Integer[] arr, int x) //Удаление
    {
        List<Integer> arrlist=new ArrayList();
        for(Integer al: arr) { arrlist.add(al);}
        for(int i=0; i< arrlist.size(); i++)
        {
            if(x==arrlist.get(i))
            {
                arrlist.remove(arrlist.get(i));
            }
        }
        Integer [] array=new Integer[arrlist.size()];
        Integer [] array_=arrlist.toArray(array);
        return array_;
    }

    public void search(Integer[] arr, int x) //Поиск
    {
        int k=0;
        for(int i=0; i<arr.length; i++)
        {
            if(x==arr[i]) {System.out.println("Есть в наличии"); k+=1;break;}
        }
        if(k==0){System.out.println("Нет в наличии");}
    }
}
