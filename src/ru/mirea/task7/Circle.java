package ru.mirea.task7;

public class Circle extends Shape
{
    protected double radius;

    public Circle()
    {
        filled = false;
        color = "black";
        radius = 10;
    }

    public Circle(double radius)
    {
        filled = false;
        color = "blue";
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled)
    {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    @Override
    public double getArea()
    {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter()
    {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString()
    {
        return "Shape: circle, radius: " + this.radius + ", color: " + this.color;
    }
}
