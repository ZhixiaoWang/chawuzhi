package com.chawuzhi.admin.pojo;

import java.util.Date;

import com.chawuzhi.admin.base.BaseDomain;

public class TbUser extends BaseDomain {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.id
     *
     * @mbggenerated Wed Apr 25 11:12:29 CST 2018
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.username
     *
     * @mbggenerated Wed Apr 25 11:12:29 CST 2018
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.password
     *
     * @mbggenerated Wed Apr 25 11:12:29 CST 2018
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.phone
     *
     * @mbggenerated Wed Apr 25 11:12:29 CST 2018
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.email
     *
     * @mbggenerated Wed Apr 25 11:12:29 CST 2018
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.created
     *
     * @mbggenerated Wed Apr 25 11:12:29 CST 2018
     */
    private Date created;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.updated
     *
     * @mbggenerated Wed Apr 25 11:12:29 CST 2018
     */
    private Date updated;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.id
     *
     * @return the value of tb_user.id
     *
     * @mbggenerated Wed Apr 25 11:12:29 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.id
     *
     * @param id the value for tb_user.id
     *
     * @mbggenerated Wed Apr 25 11:12:29 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.username
     *
     * @return the value of tb_user.username
     *
     * @mbggenerated Wed Apr 25 11:12:29 CST 2018
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.username
     *
     * @param username the value for tb_user.username
     *
     * @mbggenerated Wed Apr 25 11:12:29 CST 2018
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.password
     *
     * @return the value of tb_user.password
     *
     * @mbggenerated Wed Apr 25 11:12:29 CST 2018
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.password
     *
     * @param password the value for tb_user.password
     *
     * @mbggenerated Wed Apr 25 11:12:29 CST 2018
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.phone
     *
     * @return the value of tb_user.phone
     *
     * @mbggenerated Wed Apr 25 11:12:29 CST 2018
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.phone
     *
     * @param phone the value for tb_user.phone
     *
     * @mbggenerated Wed Apr 25 11:12:29 CST 2018
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.email
     *
     * @return the value of tb_user.email
     *
     * @mbggenerated Wed Apr 25 11:12:29 CST 2018
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.email
     *
     * @param email the value for tb_user.email
     *
     * @mbggenerated Wed Apr 25 11:12:29 CST 2018
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.created
     *
     * @return the value of tb_user.created
     *
     * @mbggenerated Wed Apr 25 11:12:29 CST 2018
     */
    public Date getCreated() {
        return created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.created
     *
     * @param created the value for tb_user.created
     *
     * @mbggenerated Wed Apr 25 11:12:29 CST 2018
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.updated
     *
     * @return the value of tb_user.updated
     *
     * @mbggenerated Wed Apr 25 11:12:29 CST 2018
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.updated
     *
     * @param updated the value for tb_user.updated
     *
     * @mbggenerated Wed Apr 25 11:12:29 CST 2018
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}