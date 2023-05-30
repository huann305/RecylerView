package com.example.rycylerview;

public class Item {
    private int image;
    private String title;
    private int avatar;

    public Item(int image, String title, int avatar) {
        this.image = image;
        this.title = title;
        this.avatar = avatar;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }
}
