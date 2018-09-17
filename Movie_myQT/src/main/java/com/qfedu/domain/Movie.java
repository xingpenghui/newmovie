package com.qfedu.domain;

import java.util.Date;

public class Movie {
    private Integer id;

    private String name;

    private String images;

    private Integer aid;

    private Date createtime;

    private Integer movietime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images == null ? null : images.trim();
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getMovietime() {
        return movietime;
    }

    public void setMovietime(Integer movietime) {
        this.movietime = movietime;
    }
}