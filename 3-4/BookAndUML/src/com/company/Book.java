package com.company;

public class Book {
    private String author;
    private String name;
    private int year;

    public void setAuthor(String author)
    {
        this.author = author;
    }
    String getAuthor()
    {
        return  author;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    String getName()
    {
        return name;
    }
    public void setYear(int year)
    {
        this.year = year;
    }
    int getYear()
    {
        return year;
    }
    String ToString()
    {
        return "Author: " + author +". Book name: " + name + ". Year: " + year;
    }
}
