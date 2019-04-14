package com.example.listviewtest;

public class Book {
    private String name;
    private int imageId;
    private String author;
    private String intro;
    private String path;
    public Book(){}
    public Book(String name, int imageId,String author,String intro)
    {
        this.name=name;
        this.imageId=imageId;
        this.author=author;
        this.intro=intro;
    }
    public String getName()
    {
        return name;
    }
    public int getImageId()
    {
        return imageId;
    }
    public String getAuthor(){return author;}
    public String getIntro(){return intro;}
    public String getPath(){return path;}
}
