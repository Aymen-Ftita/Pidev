package com.esprit.models;

public class Message {

    private int id_message;
    private int uid ;
    private int id_g;
    private String date_creation;
    private String text;

    public Message(int id_message, int uid, String date_creation, String text) {
        this.id_message = id_message;
        this.uid = uid;
        this.date_creation = date_creation;
        this.text = text;
    }

    public Message(int uid, String date_creation, String text) {
        this.uid = uid;
        this.date_creation = date_creation;
        this.text = text;
    }

    public int getId_message() {
        return id_message;
    }

    public void setId_message(int id_message) {
        this.id_message = id_message;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getDate_creation() {
        return date_creation;
    }

    public void setDate_creation(String date_creation) {
        this.date_creation = date_creation;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id_message=" + id_message +
                ", uid=" + uid +
                ", date_creation='" + date_creation + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
