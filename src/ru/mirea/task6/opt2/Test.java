package ru.mirea.task6.opt2;

public class Test
{
    public static void main(String[] args)
    {
        Book b1 = new Book("Prestuplenie i nakazanie", "F.Dostoevskyi");
        Book b2 = new Book("Geroi nachego vremeni", "M.Lermontov");
        b1.setPrice(1500);
        b2.setPrice(2000);
        Ball bl1 = new Ball(10, 15);
        Ball bl2 = new Ball(30, 50);
        bl1.setPrice(100);
        bl2.setPrice(200);
        System.out.println(b1.getPrice());
        System.out.println(b2.getPrice());
        System.out.println(bl1.getPrice());
        System.out.println(bl2.getPrice());
    }
}
