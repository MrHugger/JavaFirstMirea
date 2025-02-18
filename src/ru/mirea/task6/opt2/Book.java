package ru.mirea.task6.opt2;

public class Book implements Priceable
{
    private int price;
    private String name;
    private String author;

    public Book(String name, String author)
    {
        this.name = name;
        this.author = author;
    }
    public String getName()
            {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getAuthor()
    {
        return author;
    }
    public void setAuthor(String author)
    {
        this.author = author;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }

    @Override
    public int getPrice()
    {
        return price;
    }
    @Override
    public String toString()
    {
        return this.author+" \""+this.name+"\"";
    }
}
