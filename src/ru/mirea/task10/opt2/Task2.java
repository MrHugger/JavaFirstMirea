package ru.mirea.task10.opt2;

import java.util.Scanner;

public class Task2 {
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите n: ");
        int n = scanner.nextInt();
        System.out.println("Натуральные числа от 1 до n: " );
        for (int i= 0; i< n; i++)
        {
            System.out.print(i+1 + "  ");
        }
    }
}