package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //изначально максимум равен минимально возможному числу
        int maximum = Integer.MIN_VALUE;
        //вводим первое число - n чисел которое будет введено
        int n = Integer.parseInt(reader.readLine());

        //число должно быть больше 0
        if (n < 0)
            return;

        for (int i = 0; i < n; i++)
        {
            int x = Integer.parseInt(reader.readLine());
            if(x > maximum)
                maximum = x;
        }


        System.out.println(maximum);
    }
}
