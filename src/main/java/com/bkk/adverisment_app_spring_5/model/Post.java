package com.bkk.adverisment_app_spring_5.model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Post {

    private String title;
    private  String description;
    private LocalDate createdOn;
    private User user;
    private Category category;
    private Set<Comment> comments = new HashSet<>();

    public Post(String title, String description, LocalDate createdOn, User user, Category category) {
        this.title = title;
        this.description = description;
        this.createdOn = createdOn;
        this.user = user;
        this.category = category;
    }

    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDate createdOn) {
        this.createdOn = createdOn;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
