package ru.mirea.task5.opt2;

public class Buldog extends Dog
{
    public Buldog(String name, int age)
    {
        super(name, age);
    }
    @Override
    public void setAge(int age)
    {
        this.age = age;
    }

    @Override
    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public int getAge()
    {
        return age;
    }

    @Override
    public String getName()
    {
        return name;
    }
}
