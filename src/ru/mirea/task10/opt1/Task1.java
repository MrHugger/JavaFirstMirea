package ru.mirea.task10.opt1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите n: ");
        int n = scanner.nextInt();
        System.out.println("Треугольная последовательность: " );
        int k=1;
        for (int i = 1; i < n+1; i++)
        {
            System.out.print(k + " ");
            if (i == k*(k+1)/2)   k+=1;

        }
    }
}
