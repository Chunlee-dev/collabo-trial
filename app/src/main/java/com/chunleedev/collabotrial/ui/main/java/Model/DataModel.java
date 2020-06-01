package com.chunleedev.collabotrial.ui.main.java.Model;

public class DataModel {
    private String imageUrl;
    private String title;
    private String description;

    public DataModel(String imageUrl, String title, String description) {
        this.imageUrl = imageUrl;
        this.title = title;
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
