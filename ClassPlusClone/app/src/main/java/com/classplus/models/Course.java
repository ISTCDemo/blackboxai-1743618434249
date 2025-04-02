package com.classplus.models;

public class Course {
    private String title;
    private String description;
    private int progress;

    public Course(String title, String description, int progress) {
        this.title = title;
        this.description = description;
        this.progress = progress;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getProgress() {
        return progress;
    }
}