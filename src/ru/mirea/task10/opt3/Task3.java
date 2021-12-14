package ru.mirea.task10.opt3;

import java.util.Scanner;

public class Task3 {
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите A: ");
        int A = scanner.nextInt();
        System.out.print("Введите B: ");
        int B = scanner.nextInt();
        if (A < B )
        {
            for (int i = A; i <= B; i++)
            {
                System.out.print(i + " ");
            }
        }
        else
        {
            for (int i = A; i >= B; i--)
            {
                System.out.print(i + " ");
            }
        }
    }
}