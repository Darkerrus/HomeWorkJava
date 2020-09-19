package com.company;
import java.util.Scanner;


public class HumanTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        while (true)
        {
            System.out.println("Вы хотите создать человека? 1 - да, 2 - нет");
            int value = sc.nextInt();
            if(value == 2)
            {
                System.out.println("Удачи");
                break;
            }
            else
            {
                Human human = new Human();
                System.out.println("Введите имя человека: ");
                str = sc.next();
                human.setName(str);
                Head head = new Head();
                System.out.println("Введите форму головы вашего человека: ");
                str = sc.next();
                head.setValue_head(str);
                human.setHead(head);
                System.out.println("Вы выбрали: " + head.getValue_head());
                System.out.println("Введите длину/форму рук: ");
                str = sc.next();
                Hand hand = new Hand();
                hand.setValue_hand(str);
                human.setHand(hand);
                System.out.println("Вы выбрали: " + hand.getValue_hand());
                System.out.println("Введите длину/форму ног: ");
                Leg leg = new Leg();
                str = sc.next();
                leg.setValue_leg(str);
                human.setLeg(leg);
                System.out.println("Вы выбрали: " + leg.getValue_leg());
                System.out.println(human.ToString());

            }
        }
    }
}
