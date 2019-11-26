package com.itheima.config;


/**
 * @Configuration标注为配置类，用来代替程序中的xm配置l文件
 * 通过@EnableConfigurationProperties(JdbcProperties.class)来声明要使用JdbcProperties这个类的对象
 *
 * @author JinLu
 * @date 2019/11/25 09:52
 */
//@Configuration
//@EnableConfigurationProperties(JdbcProperties.class)
public class JdbcConfig {
    /*@Value("${jdbc.url}")
    String url;

    @Value("${jdbc.driverClassName}")
    String driverClassName;

    @Value("${jdbc.username}")
    String username;

    @Value("${jdbc.password}")
    String password;*/

    /**
     * 将druid连接池对象交给Spring IOC容器进行管理
     *
     * @return
     */
    /*@Bean
    public DataSource dataSource(JdbcProperties jdbc) {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(jdbc.getUrl());
        dataSource.setDriverClassName(jdbc.getDriverClassName());
        dataSource.setUsername(jdbc.getUsername());
        dataSource.setPassword(jdbc.getPassword());
        return dataSource;
    }*/


    /**
     * 声明要注入的属性前缀，Spring Boot会自动把相关属性通过set方法注入到DataSource中
     *
     * @return
     */
    /*@Bean
    @ConfigurationProperties(prefix = "jdbc")
    public DataSource dataSource() {
        return new DruidDataSource();
    }*/


}
