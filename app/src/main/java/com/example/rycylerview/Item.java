package com.example.rycylerview;

public class Item {
    private int image;
    private String title;
    private int avatar;
    private String view;
    private String channelName;
    private String time;

    public Item(int image, String title, int avatar, String view, String channelName, String time) {
        this.image = image;
        this.title = title;
        this.avatar = avatar;
        this.view = view + " lượt xem • ";
        this.channelName = channelName + " • ";
        this.time = time + " giờ trước";
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
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
