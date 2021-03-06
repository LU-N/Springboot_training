package com.itheima;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * Springboot有一个启动引导类，这是工程的入口类
 * 并在引导类上添加@SpringBootApplication
 *
 * @author JinLu
 * @date 2019/11/25 08:47
 */
@SpringBootApplication
@MapperScan("com.itheima.mapper")
public class Application {
    public static void main(String[] args) {
        //指定告诉入口类是Application
        SpringApplication.run(Application.class, args);
    }
}
