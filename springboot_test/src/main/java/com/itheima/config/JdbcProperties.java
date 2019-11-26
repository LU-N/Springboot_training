package com.itheima.config;



/**
 * 通过@ConfigurationProperties注解声明当前类为属性读取类
 * prefix="jdbc" 读取属性文件中，前缀为jdbc的值
 *
 * @author JinLu
 * @date 2019/11/25 18:04
 */
public class JdbcProperties {
    private String url;
    private String driverClassName;
    private String username;
    private String password;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
