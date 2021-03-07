package com.boot.skeleton;


import java.io.Serializable;

public class Books implements Serializable {

    private static final long serialVersionUID = 7156526077883281623L;

    private Integer id;
    private String name;
    private String author;
    private String publishedYear;

    public Books(Integer id, String name, String author, String publishedYear) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publishedYear = publishedYear;
    }

    public Books() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(String publishedYear) {
        this.publishedYear = publishedYear;
    }


    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publishedYear='" + publishedYear + '\'' +
                '}';
    }
}
