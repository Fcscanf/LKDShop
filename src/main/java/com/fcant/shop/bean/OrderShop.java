package com.fcant.shop.bean;

public class OrderShop {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_shop.order_shop_id
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    private String orderShopId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_shop.shop_name
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    private String shopName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_shop.trans_price
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    private Double transPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_shop.shop_photo
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    private String shopPhoto;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_shop.shop_type
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    private String shopType;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_shop.order_shop_id
     *
     * @return the value of order_shop.order_shop_id
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    public String getOrderShopId() {
        return orderShopId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_shop.order_shop_id
     *
     * @param orderShopId the value for order_shop.order_shop_id
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    public void setOrderShopId(String orderShopId) {
        this.orderShopId = orderShopId == null ? null : orderShopId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_shop.shop_name
     *
     * @return the value of order_shop.shop_name
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    public String getShopName() {
        return shopName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_shop.shop_name
     *
     * @param shopName the value for order_shop.shop_name
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_shop.trans_price
     *
     * @return the value of order_shop.trans_price
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    public Double getTransPrice() {
        return transPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_shop.trans_price
     *
     * @param transPrice the value for order_shop.trans_price
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    public void setTransPrice(Double transPrice) {
        this.transPrice = transPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_shop.shop_photo
     *
     * @return the value of order_shop.shop_photo
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    public String getShopPhoto() {
        return shopPhoto;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_shop.shop_photo
     *
     * @param shopPhoto the value for order_shop.shop_photo
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    public void setShopPhoto(String shopPhoto) {
        this.shopPhoto = shopPhoto == null ? null : shopPhoto.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_shop.shop_type
     *
     * @return the value of order_shop.shop_type
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    public String getShopType() {
        return shopType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_shop.shop_type
     *
     * @param shopType the value for order_shop.shop_type
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    public void setShopType(String shopType) {
        this.shopType = shopType == null ? null : shopType.trim();
    }
}