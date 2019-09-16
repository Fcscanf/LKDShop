package com.fcant.shop.bean;

import java.util.Date;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sh_user.user_id
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sh_user.user_name
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sh_user.phone
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sh_user.email
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sh_user.address
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sh_user.user_photo
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    private String userPhoto;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sh_user.is_valid
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    private Integer isValid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sh_user.r_id
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    private String rId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sh_user.reg_time
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    private Date regTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sh_user.user_id
     *
     * @return the value of sh_user.user_id
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sh_user.user_id
     *
     * @param userId the value for sh_user.user_id
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sh_user.user_name
     *
     * @return the value of sh_user.user_name
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sh_user.user_name
     *
     * @param userName the value for sh_user.user_name
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sh_user.phone
     *
     * @return the value of sh_user.phone
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sh_user.phone
     *
     * @param phone the value for sh_user.phone
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sh_user.email
     *
     * @return the value of sh_user.email
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sh_user.email
     *
     * @param email the value for sh_user.email
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sh_user.address
     *
     * @return the value of sh_user.address
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sh_user.address
     *
     * @param address the value for sh_user.address
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sh_user.user_photo
     *
     * @return the value of sh_user.user_photo
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    public String getUserPhoto() {
        return userPhoto;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sh_user.user_photo
     *
     * @param userPhoto the value for sh_user.user_photo
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto == null ? null : userPhoto.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sh_user.is_valid
     *
     * @return the value of sh_user.is_valid
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    public Integer getIsValid() {
        return isValid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sh_user.is_valid
     *
     * @param isValid the value for sh_user.is_valid
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sh_user.r_id
     *
     * @return the value of sh_user.r_id
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    public String getrId() {
        return rId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sh_user.r_id
     *
     * @param rId the value for sh_user.r_id
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    public void setrId(String rId) {
        this.rId = rId == null ? null : rId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sh_user.reg_time
     *
     * @return the value of sh_user.reg_time
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    public Date getRegTime() {
        return regTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sh_user.reg_time
     *
     * @param regTime the value for sh_user.reg_time
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }
}