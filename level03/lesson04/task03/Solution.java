package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Zerg zerg1 = new Zerg();
        zerg1.name = "A";
        Zerg zerg2 = new Zerg();
        zerg2.name = "B";
        Zerg zerg3 = new Zerg();
        zerg3.name = "C";
        Zerg zerg4 = new Zerg();
        zerg4.name = "D";
        Zerg zerg5 = new Zerg();
        zerg5.name = "E";
        Zerg zerg6 = new Zerg();
        zerg6.name = "F";
        Zerg zerg7 = new Zerg();
        zerg7.name = "J";
        Zerg zerg8 = new Zerg();
        zerg8.name = "H";
        Zerg zerg9 = new Zerg();
        zerg9.name = "K";
        Zerg zerg10 = new Zerg();
        zerg10.name = "L";

        Protos protos1 = new Protos();
        protos1.name = "A";
        Protos protos2 = new Protos();
        protos2.name = "B";
        Protos protos3 = new Protos();
        protos3.name = "C";
        Protos protos4 = new Protos();
        protos4.name = "D";
        Protos protos5 = new Protos();
        protos5.name = "E";

        Terran terran1 = new Terran();
        terran1.name = "A";
        Terran terran2 = new Terran();
        terran2.name = "B";
        Terran terran3 = new Terran();
        terran3.name = "c";
        Terran terran4 = new Terran();
        terran4.name = "D";
        Terran terran5 = new Terran();
        terran5.name = "E";
        Terran terran6 = new Terran();
        terran6.name = "F";
        Terran terran7 = new Terran();
        terran7.name = "J";
        Terran terran8 = new Terran();
        terran8.name = "H";
        Terran terran9 = new Terran();
        terran9.name = "K";
        Terran terran10 = new Terran();
        terran10.name = "L";
        Terran terran11 = new Terran();
        terran11.name = "M";
        Terran terran12 = new Terran();
        terran12.name = "N";
    }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}