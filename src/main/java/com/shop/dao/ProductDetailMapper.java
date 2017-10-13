package com.shop.dao;

import org.springframework.stereotype.Repository;

import com.shop.bean.ProductDetail;
@Repository
public interface ProductDetailMapper {

	void insert(ProductDetail productDetail);

	void deleteByPK(Integer productId);

	void deleteByExample(ProductDetail productDetail);

	void updateByPK(ProductDetail productDetail);

	ProductDetail findByPK(Integer productId);

	ProductDetail findByExample(ProductDetail productDetail);

}