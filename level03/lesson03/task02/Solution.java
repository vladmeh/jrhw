package com.javarush.test.level03.lesson03.task02;

/* Конвертер валют
Реализуйте метод convertEurToUsd, переводящий евро в доллары по заданному курсу.
Вызовите его дважды в методе main с любыми параметрами. Результаты выведите на экран, каждый раз с новой строки.
Подсказка:
Расчет выполняется по формуле: долларСША = евро * курс
*/
public class Solution
{
    public static void main(String[] args) {
        double course = 1.0731;
        System.out.println(convertEurToUsd(125, course));
        System.out.println(convertEurToUsd(50, course));
    }

    public static double convertEurToUsd(int eur, double course){
        double back = eur * course;

        return back;
    }
}
