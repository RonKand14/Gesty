package com.example.Gesty;

public class Gestures {
    private String head;
    private String info;
    private String img_url;
    private int number;

    public Gestures(String head, String info, String img_url)
    {
        this.head = head;
        this.info = info;
        this.img_url = img_url;
    }

    public Gestures(String head, String info, int num)
    {
        this.head = head;
        this.info = info;
        this.number = num;
    }

    public String getHead() {
        return head;
    }

    public String getInfo() {
        return info;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    @Override
    public String toString() {
        return "CardDisplay{" +
                "head='" + head + '\'' +
                ", info='" + info + '\'' +
                ", img_url='" + img_url + '\'' +
                '}';
    }
}
