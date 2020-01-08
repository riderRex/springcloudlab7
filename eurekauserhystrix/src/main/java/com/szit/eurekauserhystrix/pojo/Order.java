package com.szit.eurekauserhystrix.pojo;

import java.io.Serializable;

public class Order implements Serializable {
    private Integer id;
    private Double price;
    private String receiverName;
    private String receiverAddress;
    private String receiverPhone;

    public Order() {

    }

    public Order(Integer id, Double price, String receiverName, String receiverAddress, String receiverPhone) {
        this.id = id;
        this.price = price;
        this.receiverName = receiverName;
        this.receiverAddress = receiverAddress;
        this.receiverPhone = receiverPhone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }
}
