package com.wglvzyx.mybatisredis.entity;

import java.util.Date;

public class Blog {
    private Integer id;

    private Integer userid;

    private String title;

    private Date date;

    private String content;

    public Blog(Integer id, Integer userid, String title, Date date) {
        this.id = id;
        this.userid = userid;
        this.title = title;
        this.date = date;
    }

    public Blog(Integer id, Integer userid, String title, Date date, String content) {
        this.id = id;
        this.userid = userid;
        this.title = title;
        this.date = date;
        this.content = content;
    }

    public Blog() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}