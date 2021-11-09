package ru.mirea.task3.opt3;

public class Book
{
    private int year;
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
    public int getYear()
    {
        return year;
    }
    public void setYear(int year)
    {
        this.year = year;
    }

    @Override
    public String toString()
    {
        return "Book{" +
                "year=" + year +
                ", name=\"" + name + '\"' +
                ", author=\"" + author + '\"' +
                '}';
    }
}