package com.javarush.test.level06.lesson11.bonus03;

import java.io.*;
import java.util.*;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++)
            arr[i] = Integer.parseInt(reader.readLine());

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);

    }
}
