package com.javarush.test.level05.lesson09.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)
Задача конструктора – сделать объект валидным. Например, если вес не известен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    private int weight, age;
    private String name, color, address;

    //- Имя,
    public Cat(String name){
        this.name = name;
        this.age = 5;
        this.weight = 2;
    }

    //- Имя, вес, возраст
    public Cat(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    //- Имя, возраст (вес стандартный)
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = 2;

    }

    //- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
    public Cat (int weight, String color){
        this.weight = weight;
        this.color = color;
        this.age = 5;
    }

    //    - вес, цвет, адрес ( чужой домашний кот)
    public Cat (int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 5;
    }

}
