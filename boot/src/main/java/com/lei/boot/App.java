package com.lei.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * note-all
 *
 * @author: leiwe
 * @date 2020-05-31 21:51
 */
@SpringBootApplication
@MapperScan("com.lei.boot.mapper")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }
}
