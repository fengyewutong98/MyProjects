package com.shop.bean;

import java.util.Date;

public class Order {
    private Integer orderId;

    private Integer userId;

    private String orderStatus;

    private Long orderPayAmount;

    private Integer carId;

    private Date createDate;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    public Long getOrderPayAmount() {
        return orderPayAmount;
    }

    public void setOrderPayAmount(Long orderPayAmount) {
        this.orderPayAmount = orderPayAmount;
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}