package com.shop.bean;

public class ProductDetail {
    private Integer productId;

    private Integer productBelogTwoCategoryId;

    private Integer productNum;

    private String productName;

    private String productDescribe;

    private Float productPrice;

    private String imgurl;

    private String originAddress;

    private String period;

    private String scale;

    private String taste;

    private Integer productBelogThreeCategoryId;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getProductBelogTwoCategoryId() {
        return productBelogTwoCategoryId;
    }

    public void setProductBelogTwoCategoryId(Integer productBelogTwoCategoryId) {
        this.productBelogTwoCategoryId = productBelogTwoCategoryId;
    }

    public Integer getProductNum() {
        return productNum;
    }

    public void setProductNum(Integer productNum) {
        this.productNum = productNum;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getProductDescribe() {
        return productDescribe;
    }

    public void setProductDescribe(String productDescribe) {
        this.productDescribe = productDescribe == null ? null : productDescribe.trim();
    }

    public Float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Float productPrice) {
        this.productPrice = productPrice;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }

    public String getOriginAddress() {
        return originAddress;
    }

    public void setOriginAddress(String originAddress) {
        this.originAddress = originAddress == null ? null : originAddress.trim();
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period == null ? null : period.trim();
    }

    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale == null ? null : scale.trim();
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste == null ? null : taste.trim();
    }

    public Integer getProductBelogThreeCategoryId() {
        return productBelogThreeCategoryId;
    }

    public void setProductBelogThreeCategoryId(Integer productBelogThreeCategoryId) {
        this.productBelogThreeCategoryId = productBelogThreeCategoryId;
    }
}