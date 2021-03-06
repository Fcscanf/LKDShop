package com.fcant.shop.mapper;

import com.fcant.shop.bean.ShopCart;
import org.apache.ibatis.annotations.Mapper;

/**
 * ShopCartMapper
 *
 * encoding:UTF-8
 * @author Fcant
 * @date 下午 16:10 2019-09-17/0017
 */
@Mapper
public interface ShopCartMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_cart
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    int deleteByPrimaryKey(String cartId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_cart
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    int insert(ShopCart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_cart
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    int insertSelective(ShopCart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_cart
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    ShopCart selectByPrimaryKey(String cartId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_cart
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    int updateByPrimaryKeySelective(ShopCart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_cart
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    int updateByPrimaryKey(ShopCart record);
}