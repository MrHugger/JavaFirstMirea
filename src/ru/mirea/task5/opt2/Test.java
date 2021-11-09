package ru.mirea.task5.opt2;

public class Test
{
    public static void main(String[] args)
    {
        Shibainu h1 = new Shibainu("Druzhok", 3);
        System.out.println(h1);
        Buldog p1 = new Buldog("Sharik", 5);
        System.out.println(p1);
        System.out.println(h1.getAge());
        System.out.println(p1.getName());
    }
}
