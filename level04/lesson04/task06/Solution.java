package com.javarush.test.level04.lesson04.task06;

/* День недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название «понедельник», «вторник», «среда», «четверг», «пятница», «суббота», «воскресенье»,
если введен номер больше или меньше 7 – вывести «такого дня недели не существует».
Пример для номера 5:
пятница
Пример для номера 10:
такого дня недели не существует
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sAge = reader.readLine();
        int nAge = Integer.parseInt(sAge);

        if (nAge > 7 || nAge < 0)
            System.out.println("такого дня недели не существует");

        if (nAge == 1)
            System.out.println("понедельник");

        if (nAge == 2)
            System.out.println("вторник");

        if (nAge == 3)
            System.out.println("среда");

        if (nAge == 4)
            System.out.println("четверг");

        if (nAge == 5)
            System.out.println("пятница");

        if (nAge == 6)
            System.out.println("суббота");

        if (nAge == 7)
            System.out.println("воскресенье");

    }

}