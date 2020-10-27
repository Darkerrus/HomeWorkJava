package com.company;


class Collection
{

    private int size = 1;

    private int[] arr = new int[size];

    static int value = 0;


    public int[] getArr() {
        return arr;
    }


    public int getSize() {
        return size;
    }

    public void addEl(int a)
    {
        if(value == getSize())
        {
            int[] arr2 = new int[getSize()];
            for(int i = 0; i < getSize(); i++)
            {
                arr2[i] = arr[i];
            }
            size+=1;
            arr = new int[size];
            for (int i = 0; i < getSize() -1; i++) {
                arr[i] = arr2[i];
            }
            arr[value] = a;
            value++;
        }
        else {
            arr[value] = a;
            value++;
        }
    }


    public void delEl()
    {
        size-= 1;
        int[] arr2 = new int[getSize()];
        for (int i = 0; i < getSize(); i ++)
        {
            arr2[i] = arr[i];
        }
        arr = new int[getSize()];
        for (int i = 0; i < getSize(); i++)
        {
            arr[i] = arr2[i];
        }
        value--;
    }

    public void searchValue(int a)
    {
        for (int i = 0; i < getSize(); i++)
        {
            if (arr[i] == a)
                System.out.println("Ваше число " + a + " на " + i + " позиции");
        }
    }

    public void searchIndex(int a)
    {
        System.out.println("По индексу " + a + "находится число " + arr[a]);
    }

    public int searchMAX()
    {
        int max = 1;
        for (int i = 0; i < getSize(); i++)
        {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }
    public int searchMIN()
    {
        int min = 100000000;
        for (int i = 0; i < getSize(); i++)
        {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }

    public double average()
    {
        double res = 0;
        for (int i = 0; i < getSize(); i++)
        {
            res+= arr[i];
        }
        res = res / getSize();
        return res;
    }


}

public class Main {

    public static void main(String[] args) {

        Collection array = new Collection();
        array.addEl(5);
        array.addEl(6);
        array.addEl(7);
        for (int i = 0; i < array.getSize(); i++)
        {
            System.out.println(array.getArr()[i]);
        }
        array.delEl();
        System.out.println("------------------------------------");
        for (int i = 0; i < array.getSize(); i++)
        {
            System.out.println(array.getArr()[i]);
        }
        System.out.println("------------------------------------");
        array.addEl(7);
        for (int i = 0; i < array.getSize(); i++)
        {
            System.out.println(array.getArr()[i]);
        }
        System.out.println("------------------------------------");
        System.out.println(array.average());
    }
}
