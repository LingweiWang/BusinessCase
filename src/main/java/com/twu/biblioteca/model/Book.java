package com.twu.biblioteca.model;

/**
 * Created by apple on 15-6-2.
 */
public class Book {

    private String name;
    private String author;
    private String publishTime;
    private String status;
    public Book(String name, String author, String publishTime,String status){
        this.name = name;
        this.author = author;
        this.publishTime = publishTime;
        this.status = status;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
