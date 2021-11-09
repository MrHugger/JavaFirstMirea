package ru.mirea.task7;

public class Square extends Rectangle
{
    Square() {
        color = "yellow";
        filled = true;
        width = 10;
        length = 15;
    }

    Square(double side)
    {
        this.length = side;
        this.width = side;
    }

    Square(double side, String color, boolean filled)
    {
        this.length = side;
        this.width = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide()
    {
        return super.getWidth();
    }

    public void setSide(double side)
    {
        this.length = side;
        this.width = side;
    }

    @Override
    public void setWidth(double side)
    {
        this.width = side;
        this.length = side;
    }

    @Override
    public void setLength(double side)
    {
        this.length = side;
        this.width = side;
    }

    @Override
    public String toString()
    {
        return "color = " + color + " filled = " + filled + " width = " + width + " length = " + length;
    }
}
