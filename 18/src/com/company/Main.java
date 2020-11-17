package com.company;

import java.util.Scanner;

class One {


    public void f1(int n)
    {
        int a = 2;
        while (a <= n)
        {
            if (n % a == 0)
            {
                if (a != n)
                {
                    System.out.print(a + " ");
                    f1(n / a);
                } else System.out.print(a);
                return;
            }
            a++;
        }
    }
}

class Two
{
    static boolean f2(String s)
    {
        if(s.length() == 0 || s.length() == 1)
            return true;
        if(s.charAt(0) == s.charAt(s.length()-1))
            return f2(s.substring(1, s.length()-1));
        return false;
    }
}


class Three
{
    public void f3()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Вводите числа, чтобы завершить запись, введите 0");
        int max = in.nextInt();
        while(true){
            int a = in.nextInt();
            if(a == 0)
                break;
            if(a > max)
                max = a;
        }
        System.out.println("Максимальное число: " + max);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        One one = new One();
        one.f1(in.nextInt());
        Two two = new Two();
        System.out.println("Введите строку");
        System.out.print(two.f2(in.nextLine()) ? "Это палиндром" : "Это не палиндром");
        Three three = new Three();
        three.f3();
    }
}
