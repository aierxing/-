package com.lei.支付宝接入.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 学习
 *
 * @author: leiwe
 * @date 2020-03-19 21:32
 */
@RestController
public class OneController {
    @GetMapping
    @RequestMapping(path = "/")
    public String Get(){
        return "One";
    }

    @RequestMapping(path = "/return")
    public String get1(){
        return "success";
    }

}
