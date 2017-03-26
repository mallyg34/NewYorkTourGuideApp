package com.example.android.newyorktourguideapp;

/**
 * Created by Daguru34 on 3/26/2017.
 */

public class Trips {

    private String name;
    private String address;
    private String phoneNumber;
    private int mImageResourceId= NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED= -1;

    public Trips(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public Trips(String name, String address, String phoneNumber, int mImageResourceId) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.mImageResourceId = mImageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId!=NO_IMAGE_PROVIDED;
    }

    @Override
    public String toString() {
        return "Trips{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                '}';
    }
}
