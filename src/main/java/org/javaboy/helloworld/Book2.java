package org.javaboy.helloworld;


//import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Book2 {
    private Integer id;
    private String name;
    private String author;
    //@JsonFormat(pattern = "yyyy-MM-dd",timezone = "Asia/Shanghai")
    private Date publish;


    public Date getPublish() {
        return publish;
    }

    public void setPublish(Date publish) {
        this.publish = publish;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}

