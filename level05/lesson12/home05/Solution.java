package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int sum = 0;
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        for (; true; ){
            String s = buffer.readLine();
            if (s.equals("сумма")){
                System.out.println(sum);
                break;
            }
            else{
                int n = Integer.parseInt(s);
                sum += n;
            }
        }

    }
}
