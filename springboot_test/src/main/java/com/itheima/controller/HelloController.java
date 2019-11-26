package com.itheima.controller;

import com.itheima.pojo.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author JinLu
 * @date 2019/11/25 08:58
 */
@RestController
public class HelloController {

    /*@Autowired
    private DataSource dataSource;

    @Value("${itcast.url}")
    private String itcastUrl;

    @Value("${itheima.url}")
    private String itHeimaUrl;

    @GetMapping("hello")
    public String hello() {
        System.out.println("itcastUrl" + itcastUrl);
        System.out.println("itHeimaUrl" + itHeimaUrl);
        //输出数据源对象
        System.out.println("Datasource:" + dataSource);
        return "hello,spring boot";
    }*/

    @Autowired
    private UserService userService;
    /**
     * 根据id获取用户
     * @param id 用户id * @return 用户
     */
    @GetMapping("/user/{id}")
    public User queryById(@PathVariable Long id){
        return userService.queryById(id);
    }
}
