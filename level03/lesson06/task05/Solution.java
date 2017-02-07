package com.javarush.test.level03.lesson06.task05;

/* Изучаем японский
Выведи на экран 日本語
*/

public class Solution
{
    public static void main(String[] args)
    {
        //System.out.print("日本語");
        char a = '\u65E5';
        char b = '\u672c';
        char c = '\u8a9e';

        System.out.print(a);
        System.out.print(b);
        System.out.print(c);
    }
}