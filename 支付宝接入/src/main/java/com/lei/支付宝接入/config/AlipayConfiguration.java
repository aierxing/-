package com.lei.支付宝接入.config;

import com.alipay.api.DefaultAlipayClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 学习
 *
 * @author: leiwe
 * @date 2020-03-19 21:56
 */
@Configuration
public class AlipayConfiguration {
    @Autowired
    private AlipayProperties properties;

//    @Bean
//    public AlipayTradeService alipayTradeService() {
//        return new AlipayTradeServiceImpl.ClientBuilder()
//                .setGatewayUrl(properties.getGatewayUrl())
//                .setAppid(properties.getAppid())
//                .setPrivateKey(properties.getAppPrivateKey())
//                .setAlipayPublicKey(properties.getAlipayPublicKey())
//                .setSignType(properties.getSignType())
//                .build();
//    }

    @Bean
    public DefaultAlipayClient defaultAlipayClient(){
        return new DefaultAlipayClient(
                properties.getServerUrl(),
                properties.getAppId(),
                properties.getAppPrivateKey(),
                properties.getFormat(),
                properties.getCharset(),
                properties.getAlipayPublicKey(),
                properties.getSignType());
    }
}
