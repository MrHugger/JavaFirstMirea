package ru.mirea.task23.bank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HashCodeTest {
    List<User> clientList= new ArrayList<>();
    public boolean checkUser(String login,String password)
    {
        for (int i=0;i<5;i++)
        {
            if(login.hashCode()==clientList.get(i).getLogin().hashCode() && password.hashCode()==clientList.get(i).getPassword().hashCode())
                return true;
        }
        return false;
    }

    public static void main(String[] args){
        HashCodeTest hashTest=new HashCodeTest();
        hashTest.clientList.add(new User("Amelyanovich","12345"));
        hashTest.clientList.add(new User("Belov","67890"));
        hashTest.clientList.add(new User("Bokach","11111"));
        hashTest.clientList.add(new User("Bruhachev","22222"));
        hashTest.clientList.add(new User("Bukanovskaya","33333"));
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<5;i++) {
            System.out.println("Хэш-код логина пользователя №"+i+": "+hashTest.clientList.get(i).getLogin().hashCode());
            System.out.println("Хэш-код пароля пользователя №"+i+": "+hashTest.clientList.get(i).getPassword().hashCode());
        }
        String login = null,password = null;
        System.out.println("Логин: ");
        login=sc.next();
        System.out.println("Хэш-код логина: "+login.hashCode());
        System.out.println("Пароль: ");
        password=sc.next();
        System.out.println("Хэш-код пароля: "+password.hashCode());
        while(!hashTest.checkUser(login, password))
        {
            System.out.println("Неверный логин или пароль");
            System.out.println("Логин: ");
            login=sc.next();
            System.out.println("Хэш-код логина: "+login.hashCode());
            System.out.println("Пароль: ");
            password=sc.next();
            System.out.println("Хэш-код пароля: "+password.hashCode());
        }
        System.out.println("Добро пожаловать!");
    }
}
