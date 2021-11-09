package ru.mirea.task5.opt1;

public class Plate extends Dish
{
    private String manufacturer;
    private double diameter;
    public Plate(String color, String material, double diameter)
    {
        super(color, material);
        this.diameter = diameter;
    }
    @Override
    public String toString()
    {
        return "Plate{" +
                "color=" + getColor() + ", " +
                "material=" + getMaterial() + ", " +
                "diameter=" + diameter +
                '}';
    }
}
