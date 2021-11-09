package ru.mirea.task5.opt1;

public class Pot extends Dish
{
    private double volume;
    public Pot(String color, String material, double volume)
    {
        super(color, material);
        this.volume = volume;

    }
    @Override
    public String toString()
    {
        return "Pot{" +
                "color=" + getColor() + ", " +
                "material=" + getMaterial() + ", " +
                "volume=" + volume +
                '}';
    }
}
