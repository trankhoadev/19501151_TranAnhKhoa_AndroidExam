package com.example.a19501151_trananhkhoa_androidexam;

public class Bussiness {
    private String name, time, type, date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Bussiness(String name, String time, String type, String date) {
        this.name = name;
        this.time = time;
        this.type = type;
        this.date = date;
    }
}
