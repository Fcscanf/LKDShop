package com.fcant.shop.mapper;

import com.fcant.shop.bean.Board;

public interface BoardMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_board
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    int deleteByPrimaryKey(String boardId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_board
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    int insert(Board record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_board
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    int insertSelective(Board record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_board
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    Board selectByPrimaryKey(String boardId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_board
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    int updateByPrimaryKeySelective(Board record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_board
     *
     * @mbg.generated Mon Sep 16 23:13:05 GMT+08:00 2019
     */
    int updateByPrimaryKey(Board record);
}