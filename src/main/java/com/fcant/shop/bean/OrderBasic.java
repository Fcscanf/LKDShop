package com.fcant.shop.bean;

import java.util.Date;

public class OrderBasic {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_basic.oeder_id
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    private String oederId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_basic.user_id
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_basic.order_shop_id
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    private String orderShopId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_basic.shopping_num
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    private Integer shoppingNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_basic.create_time
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_basic.oeder_id
     *
     * @return the value of order_basic.oeder_id
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    public String getOederId() {
        return oederId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_basic.oeder_id
     *
     * @param oederId the value for order_basic.oeder_id
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    public void setOederId(String oederId) {
        this.oederId = oederId == null ? null : oederId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_basic.user_id
     *
     * @return the value of order_basic.user_id
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_basic.user_id
     *
     * @param userId the value for order_basic.user_id
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_basic.order_shop_id
     *
     * @return the value of order_basic.order_shop_id
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    public String getOrderShopId() {
        return orderShopId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_basic.order_shop_id
     *
     * @param orderShopId the value for order_basic.order_shop_id
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    public void setOrderShopId(String orderShopId) {
        this.orderShopId = orderShopId == null ? null : orderShopId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_basic.shopping_num
     *
     * @return the value of order_basic.shopping_num
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    public Integer getShoppingNum() {
        return shoppingNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_basic.shopping_num
     *
     * @param shoppingNum the value for order_basic.shopping_num
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    public void setShoppingNum(Integer shoppingNum) {
        this.shoppingNum = shoppingNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_basic.create_time
     *
     * @return the value of order_basic.create_time
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_basic.create_time
     *
     * @param createTime the value for order_basic.create_time
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}