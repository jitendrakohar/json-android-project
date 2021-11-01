package com.example.earthquakedata;

public class arraylist {
    private String mag;
    private String place;
    private String time;

    public arraylist(String mag, String place, String time) {
        this.mag = mag;
        this.place = place;
        this.time = time;
    }





    public String getMag() {
        return mag;
    }

    public String getPlace() {
        return place;
    }

    public String getTime() {
        return time;
    }


    public void setMag(String mag) {
        this.mag = mag;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
