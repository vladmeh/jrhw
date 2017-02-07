package com.javarush.test.level03.lesson08.task02;

/* Зарплата через 5 лет
Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись:
«Имя» получает «число1» через «число2» лет.
Пример: Коля получает 3000 через 5 лет.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String sN1 = reader.readLine();
        String sN2 = reader.readLine();

        int n1 = Integer.parseInt(sN1);
        int n2 = Integer.parseInt(sN2);

        System.out.println(name + " получает " + n1 + " через " + n2 + " лет.");

    }
}