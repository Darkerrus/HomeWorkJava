package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> player1 = new ArrayList<Integer>();
        ArrayList<Integer> player2 = new ArrayList<Integer>();
        int count = 0;
        System.out.println("Сколько карт будет?");
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        a = sc.nextInt();

        System.out.println("Введите карты для 1 игрока: ");
        for (int i = 0; i < a; i++)
        {
            b = sc.nextInt();
            player1.add(b);
        }

        System.out.println("Введите карты для 2 игрока: ");
        for (int i = 0; i < a; i++)
        {
            b = sc.nextInt();
            player2.add(b);
        }


        while (true)
        {
            if(player1.isEmpty()) {
                System.out.println("Победил 2 игрок за " + count + " ходов.");
                break;
            }

            if (player2.isEmpty()) {
                System.out.println("Победил 1 игрок за " + count + " ходов.");
                break;
            }

            if (count > 106)
                break;
            if(player1.get(0) == 0 && player2.get(0) == 9)
            {
                player1.add(player1.get(0));
                player1.add(player2.get(0));
                player1.remove(0);
                player2.remove(0);
            }
            else if(player1.get(0) == 9 && player2.get(0) == 0)
            {
                player2.add(player1.get(0));
                player2.add(player2.get(0));
                player2.remove(0);
                player1.remove(0);
            }
            else if(player1.get(0) > player2.get(0))
            {
                player1.add(player1.get(0));
                player1.add(player2.get(0));
                player1.remove(0);
                player2.remove(0);
            }
            else
            {
                player2.add(player1.get(0));
                player2.add(player2.get(0));
                player2.remove(0);
                player1.remove(0);
            }
            count++;
        }
    }
}
