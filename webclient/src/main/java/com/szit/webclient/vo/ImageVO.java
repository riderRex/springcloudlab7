package com.szit.webclient.vo;


import java.io.Serializable;

/**
 * Created by deng on 2018/5/18.
 */
public class ImageVO implements Serializable {
    private String description;
    private String url;

    public ImageVO(String description, String url) {
        this.description = description;
        this.url = url;
    }

    public ImageVO(){

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
