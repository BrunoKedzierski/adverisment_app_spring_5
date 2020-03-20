package com.bkk.advertisment_app_spring_5.model;

import java.time.LocalDate;

public class Comment extends BaseEntity {

    private User user;
    private String content;
    private LocalDate createdOn;

    public Comment(User user, String content, LocalDate createdOn) {
        this.user = user;
        this.content = content;
        this.createdOn = createdOn;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDate createdOn) {
        this.createdOn = createdOn;
    }
}
