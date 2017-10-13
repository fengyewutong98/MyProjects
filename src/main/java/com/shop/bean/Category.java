package com.shop.bean;

public class Category {
    private Integer categoryId;

    private Integer secondCategoryId;

    private String categoryName;

    private Integer categoryLeve;

    private Integer belongFirstLeve;

    private String clastyle;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getSecondCategoryId() {
        return secondCategoryId;
    }

    public void setSecondCategoryId(Integer secondCategoryId) {
        this.secondCategoryId = secondCategoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    public Integer getCategoryLeve() {
        return categoryLeve;
    }

    public void setCategoryLeve(Integer categoryLeve) {
        this.categoryLeve = categoryLeve;
    }

    public Integer getBelongFirstLeve() {
        return belongFirstLeve;
    }

    public void setBelongFirstLeve(Integer belongFirstLeve) {
        this.belongFirstLeve = belongFirstLeve;
    }

    public String getClastyle() {
        return clastyle;
    }

    public void setClastyle(String clastyle) {
        this.clastyle = clastyle == null ? null : clastyle.trim();
    }
}