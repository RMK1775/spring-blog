package com.codeup.blog.models;

import javax.persistence.*;

@Entity
@Table(name = "ad_images")
public class AdImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String path;

    @ManyToOne
    @JoinColumn (name = "ad_id")
    private Ad ad;

    public AdImage() { }

//Read
    public AdImage(long id, String path, Ad ad) {
        this.id = id;
        this.path = path;
        this.ad = ad;
    }

//Create
    public AdImage(String path, Ad ad) {
        this.path = path;
        this.ad = ad;
    }

//Getters and Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Ad getAd() {
        return ad;
    }

    public void setAd(Ad ad) {
        this.ad = ad;
    }
}