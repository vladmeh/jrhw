package com.javarush.test.level05.lesson05.task02;

/* Реализовать метод fight
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Зависимость придумать самому. Метод должен определять, выиграли ли мы (this) бой или нет,
т.е. возвращать true, если выиграли и false - если нет.
Должно выполняться условие:
если cat1.fight(cat2) = true , то cat2.fight(cat1) = false
*/

public class Cat
{
    public String name;
    public int age;
    public int weight;
    public int strength;

    // Здесь метод майн НЕ НУЖЕН по УСЛОВИЮ
    // Написан только ДЛЯ ПРОВЕРКИ в IDEA
    /*public static void main(String[] args)
    {
        //1 кот
        Cat vaska = new Cat();
        vaska.name = "vaska";
        vaska.age = 2;
        vaska.weight = 4;
        vaska.strength = 10;

        //2 кот
        Cat murzik = new Cat();
        murzik.name = "vaska";
        murzik.age = 4;
        murzik.weight = 6;
        murzik.strength = 8;

        System.out.println(vaska.fight(murzik));
        System.out.println(murzik.fight(vaska));
    }*/

    public Cat()
    {
    }

    public boolean fight(Cat anotherCat)
    {
        return (this.strength > anotherCat.strength);

    }
}
