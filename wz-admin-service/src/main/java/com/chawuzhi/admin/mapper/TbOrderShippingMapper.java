package com.chawuzhi.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chawuzhi.admin.pojo.TbOrderShipping;
import com.chawuzhi.admin.pojo.TbOrderShippingExample;

public interface TbOrderShippingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_shipping
     *
     * @mbggenerated Wed Apr 25 11:12:29 CST 2018
     */
    int countByExample(TbOrderShippingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_shipping
     *
     * @mbggenerated Wed Apr 25 11:12:29 CST 2018
     */
    int deleteByExample(TbOrderShippingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_shipping
     *
     * @mbggenerated Wed Apr 25 11:12:29 CST 2018
     */
    int deleteByPrimaryKey(String orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_shipping
     *
     * @mbggenerated Wed Apr 25 11:12:29 CST 2018
     */
    int insert(TbOrderShipping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_shipping
     *
     * @mbggenerated Wed Apr 25 11:12:29 CST 2018
     */
    int insertSelective(TbOrderShipping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_shipping
     *
     * @mbggenerated Wed Apr 25 11:12:29 CST 2018
     */
    List<TbOrderShipping> selectByExample(TbOrderShippingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_shipping
     *
     * @mbggenerated Wed Apr 25 11:12:29 CST 2018
     */
    TbOrderShipping selectByPrimaryKey(String orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_shipping
     *
     * @mbggenerated Wed Apr 25 11:12:29 CST 2018
     */
    int updateByExampleSelective(@Param("record") TbOrderShipping record, @Param("example") TbOrderShippingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_shipping
     *
     * @mbggenerated Wed Apr 25 11:12:29 CST 2018
     */
    int updateByExample(@Param("record") TbOrderShipping record, @Param("example") TbOrderShippingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_shipping
     *
     * @mbggenerated Wed Apr 25 11:12:29 CST 2018
     */
    int updateByPrimaryKeySelective(TbOrderShipping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_shipping
     *
     * @mbggenerated Wed Apr 25 11:12:29 CST 2018
     */
    int updateByPrimaryKey(TbOrderShipping record);
}