package com.twu.biblioteca.model;

/**
 * Created by apple on 15-6-2.
 */
public class Book {

    private String name;
    private String author;
    private String publishTime;
    public Book(String name, String author, String publishTime){
        this.name = name;
        this.author = author;
        this.publishTime = publishTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }
}
