package com.project.mobile.mininow.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Store implements Serializable {

    private long id;
    private String uid;
    private String name;
    private String address;
    private String phone;
    private String email;
    private String description;
    private String imgURL;
    private String bannerURL;
    private LocalDateTime registerTime;
    private Double latitude;
    private Double longitude;
    private String distance;

    public Store() {
    }

    public Store(long id, String uid, String name, String address, String phone, String email, String description, String imgURL, String bannerURL, LocalDateTime registerTime, Double latitude, Double longitude, String distance) {
        this.id = id;
        this.uid = uid;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.description = description;
        this.imgURL = imgURL;
        this.bannerURL = bannerURL;
        this.registerTime = registerTime;
        this.latitude = latitude;
        this.longitude = longitude;
        this.distance = distance;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    public String getBannerURL() {
        return bannerURL;
    }

    public void setBannerURL(String bannerURL) {
        this.bannerURL = bannerURL;
    }

    public LocalDateTime getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(LocalDateTime registerTime) {
        this.registerTime = registerTime;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }
}
