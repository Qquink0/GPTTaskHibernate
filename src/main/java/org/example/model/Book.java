package org.example.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Book")
public class Book {

    public Book() {
    }

    public Book(int id, String title, String author, int age) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.age = age;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "age")
    private int age;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
