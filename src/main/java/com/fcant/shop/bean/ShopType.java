package com.fcant.shop.bean;

public class ShopType {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop_type.shop_type_id
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    private String shopTypeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop_type.shop_type_name
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    private String shopTypeName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop_type.shop_type_id
     *
     * @return the value of shop_type.shop_type_id
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    public String getShopTypeId() {
        return shopTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop_type.shop_type_id
     *
     * @param shopTypeId the value for shop_type.shop_type_id
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    public void setShopTypeId(String shopTypeId) {
        this.shopTypeId = shopTypeId == null ? null : shopTypeId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop_type.shop_type_name
     *
     * @return the value of shop_type.shop_type_name
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    public String getShopTypeName() {
        return shopTypeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop_type.shop_type_name
     *
     * @param shopTypeName the value for shop_type.shop_type_name
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    public void setShopTypeName(String shopTypeName) {
        this.shopTypeName = shopTypeName == null ? null : shopTypeName.trim();
    }
}