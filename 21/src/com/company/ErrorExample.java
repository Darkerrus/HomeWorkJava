package com.company;

import java.util.Scanner;

public class ErrorExample {


    public void exceptionDemo ()
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter an integer ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString); System.out.println( 2 / i );
    }
}
