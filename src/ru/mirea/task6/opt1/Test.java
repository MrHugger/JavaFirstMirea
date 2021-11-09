package ru.mirea.task6.opt1;

public class Test
{
    public static void main(String[] args)
    {
        Dog d1 = new Dog("Bobik", 1);
        Dog d2 = new Dog("Druzhok", 3);
        d1.setName("Pesel");
        d2.setName("Sharik");
        Person p1 = new Person("Nina");
        Person p2 = new Person("Vasya");
        p1.setName("Nastya");
        p2.setName("Billy");
        System.out.println(d1.getName());
        System.out.println(d2.getName());
        System.out.println(p1.getName());
        System.out.println(p2.getName());
    }
}
