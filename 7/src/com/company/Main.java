package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Person Egor = new Person();
        FurnitureShop magazine = new FurnitureShop();
        int value = 1;
        String name;
        Scanner sc = new Scanner(System.in);
       do {
           if(value == 0)
               break;
           else
           {
               System.out.println("Добро пожаловать в лучший магазин мебели в мире. На ваш выбор представлены все наши лучшие товары.\n");
               System.out.println(magazine.toString());
               System.out.println("Введите вид мебели, которую хотите купить!\n");
               name = sc.next();
                   switch (name) {
                       case "Стул":
                           Egor.basket.add(magazine.FS.get(0));
                           break;
                       case "Шкаф":
                           Egor.basket.add(magazine.FS.get(1));
                           break;
                       case "Тумбочка":
                           Egor.basket.add(magazine.FS.get(2));
                           break;
                       case "Диван":
                           Egor.basket.add(magazine.FS.get(3));
                           break;
                       case "Стол":
                           Egor.basket.add(magazine.FS.get(4));
                           break;

                   }
                   System.out.println("Поздравляем, вы купили" + Egor.basket);
               }
               System.out.println("Спасибо за покупку! Если хотите выйти с магазина введите 0. Если хотите продолжить покупки введите 1");
               value = sc.nextInt();
       } while (true);
    }
}
