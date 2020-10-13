package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество знаков числа и сумму цифр числа через пробел");
        Damn damn = new Damn();
        System.out.println(damn.f(sc.nextInt(), sc.nextInt(), 0, 0));
        System.out.println("Введите числа a и b через пробел");
        System.out.println(damn.q(sc.nextInt(), sc.nextInt()));
        System.out.println("Введите число");
        System.out.println(damn.g(0, sc.nextInt()));
    }
}
