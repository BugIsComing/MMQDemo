package com.lc.mmqdemo.common;

/**
 * @Author:LC
 * @Date:Created in 22:43 2017/11/14
 * @Modifyed by:
 */
public class Config {
    private String mqURL;
    private String mqQueue;
    private String mqUserName;
    private String mqPassword;
    private String jdbcDriver;
    private String jdbcURL;
    private String jdbcUserName;
    private String jdbcPassword;

    public String getMqURL() {
        return mqURL;
    }

    public void setMqURL(String mqURL) {
        this.mqURL = mqURL;
    }

    public String getMqQueue() {
        return mqQueue;
    }

    public void setMqQueue(String mqQueue) {
        this.mqQueue = mqQueue;
    }

    public String getMqUserName() {
        return mqUserName;
    }

    public void setMqUserName(String mqUserName) {
        this.mqUserName = mqUserName;
    }

    public String getMqPassword() {
        return mqPassword;
    }

    public void setMqPassword(String mqPassword) {
        this.mqPassword = mqPassword;
    }

    public String getJdbcDriver() {
        return jdbcDriver;
    }

    public void setJdbcDriver(String jdbcDriver) {
        this.jdbcDriver = jdbcDriver;
    }

    public String getJdbcURL() {
        return jdbcURL;
    }

    public void setJdbcURL(String jdbcURL) {
        this.jdbcURL = jdbcURL;
    }

    public String getJdbcUserName() {
        return jdbcUserName;
    }

    public void setJdbcUserName(String jdbcUserName) {
        this.jdbcUserName = jdbcUserName;
    }

    public String getJdbcPassword() {
        return jdbcPassword;
    }

    public void setJdbcPassword(String jdbcPassword) {
        this.jdbcPassword = jdbcPassword;
    }
}
