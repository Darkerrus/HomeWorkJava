package com.company;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


class Dog
{
    private String name;
    private int age;
    Dog(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public void humanAge()
    {
        int human_age = age * 7;
        System.out.println("Возраст собаки по человеческим меркам: " + human_age);
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public int getAge()
    {
        return age;
    }

    @Override
    public String toString() {
        return this.name + " " + getAge();
    }


}
class DogKennel {

    ArrayList<Dog> dogs = new ArrayList<Dog>();
    public void addDog(Dog a)
	{
		this.dogs.add(a);
	}

	public void printDogs()
	{
		for(Dog a: dogs)
		{
			System.out.println(a);
		}
	}

}

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Kostya",14);
        String str = dog.toString();
        System.out.println(str);
        DogKennel dogk = new DogKennel();
        Dog Vasya = new Dog("Vasya", 15);
        Dog Kolya = new Dog("Kolya", 15);
        Dog Danil = new Dog("Danil", 15);
        dogk.addDog(Vasya);
        dogk.addDog(Kolya);
        dogk.addDog(Danil);


        System.out.println("Задание 1");
        int[] arr = {5, 10, 15, 20, 35};
        for1(arr);
        while2(arr);
        dowhile3(arr);
        System.out.println("Задание 2");
        for(int i =0;i< args.length;i++)
        {
            System.out.println(args[i] + " ");
        }
        System.out.println("Задание 3");
        format();
        System.out.println();
        System.out.println("Задание 4");
        rand();
        System.out.println();
        System.out.println("Задание 5");
        fact(10);
        System.out.println("Задание 6");
        {

        }
    }



    public static void for1(int[] array)
    {
        int res1 = 0;
        for (int i = 0; i < array.length; i++)
        {
            res1 += array[i];
        }
        System.out.println("result for: " + res1);
    }

    public static void while2(int[] array)
    {
        int a = 0;
        int res2 = 0;
        while (a != array.length)
        {
            res2 += array[a];
            a++;
        }
        System.out.println("result while: " + res2);
    }

    public static void dowhile3(int[] array)
    {
        int b = 0;
        int res3 = 0;

        do {
            res3 += array[b];
            b++;
        } while (b != array.length);
        System.out.println("result do while: " + res3);
    }

    public static void format()
    {
        float[] arr = {1/2f, 1/3f, 1/4f, 1/5f, 1/6f, 1/7f, 1/8f, 1/9f, 1/10f};
        for (int i = 0; i < arr.length; i++)
        {
            String st = String.format("%.1f", arr[i]);
            System.out.print(st + "   ");

        }
    }
    public static void rand()
    {
        int[] arr1 = new int[4];
        double a = 0;
        for (int i = 0; i < arr1.length; i++)
        {
            a = (Math.random()*(100 - 0)+0);
            arr1[i] = (int) a;
        }
        for (int i = 0; i < arr1.length; i++)
        {
            Arrays.sort(arr1);
            System.out.print(arr1[i] + " ");
        }

        System.out.println();


        int[] arr2 = new int[4];
        Random rand = new Random();
        for (int i = 0; i < arr2.length; i++)
        {
            arr2[i] = rand.nextInt();
        }
        for (int j : arr2) {
            Arrays.sort(arr2);
            System.out.print(j + " ");
        }

    }
    public static int fact(int b)
    {
        int res = 0;
        res = 1*b;
        while(true)
        {
            res = res * b;
            b--;
            if(b == 0)
            {
                System.out.println(res);
                break;
            }
        }
        return b;
    }

}
