package ru.mirea.task4;

public class Test {
    public static void main(String[] args)
    {
        Ball b1 = new Ball(70, 70);
        System.out.println(b1);
        b1.move(50, 10);
        System.out.println(b1);
        Author a1 = new Author("Alyx", "alyx.@gmail.com", 'F');
        Author a2 = new Author("Sergey", "sergey.@gmail.com", 'M');
        System.out.println(a1.getName());
        System.out.println(a2.getName());
    }
}
