package com.lei.支付宝接入.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * 学习
 *
 * @author: leiwe
 * @date 2020-03-19 22:18
 */
@Configuration
public class WebMvcConfiguration extends WebMvcConfigurationSupport {
    @Override
    protected void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/toPay").setViewName("toPay");
        super.addViewControllers(registry);
    }
}
