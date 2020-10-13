package com.company;

public class Damn {

    public static int f(int k, int s, int sum, int length){
        if ((length == k) && (sum == s))
            return 1;
        if (length == k)
            return 0;
        int counter = 0;
        for(int i = (length == 0 ? 1 : 0); i < 10; i++)
            counter += f(k, s, sum + i, length + 1);
        return counter;
    }
    public static int q(int a, int b){
        if (a > b + 1)
            return 0;
        if (a == 0 || b == 0)
            return 1;
        return q(a, b - 1) + q(a - 1, b - 1); // либо последнняя цифра 0, тогда предпосл. - 1, либо последняя 1
    }
    public static int g(int a, int n){
        if (n == 0)
            return a;
        else
            return g(a * 10 + n % 10, n / 10);
    }
}
