package com.lei.支付宝接入.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * 学习
 *
 * @author: leiwe
 * @date 2020-03-19 21:44
 */
@Data
@Component
@ConfigurationProperties(prefix = "pay.alipay")
public class AlipayProperties {
    /** 支付宝gatewayUrl */
    private String serverUrl;
    /** 商户应用id */
    private String appId;
    /** RSA私钥，用于对商户请求报文加签 */
    private String appPrivateKey;
    /** 支付宝RSA公钥，用于验签支付宝应答 */
    private String alipayPublicKey;
    /** 签名类型 */
    private String signType = "RSA2";
    /** 格式 */
    private String format = "json";
    /** 编码 */
    private String charset = "UTF-8";
    /** 同步地址 */
    private String returnUrl;
    /** 异步地址 */
    private String notifyUrl;
    /** 最大查询次数 */
    private static int maxQueryRetry = 5;
    /** 查询间隔（毫秒） */
    private static long queryDuration = 5000;
    /** 最大撤销次数 */
    private static int maxCancelRetry = 3;
    /** 撤销间隔（毫秒） */
    private static long cancelDuration = 3000;
    private AlipayProperties() {}
    public String description() {
        StringBuilder sb = new StringBuilder("\nConfigs{");
        sb.append("支付宝网关: ").append(serverUrl).append("\n");
        sb.append(", appid: ").append(appId).append("\n");
        sb.append(", 商户RSA私钥: ").append(getKeyDescription(appPrivateKey)).append("\n");
        sb.append(", 支付宝RSA公钥: ").append(getKeyDescription(alipayPublicKey)).append("\n");
        sb.append(", 签名类型: ").append(signType).append("\n");
        sb.append(", 查询重试次数: ").append(maxQueryRetry).append("\n");
        sb.append(", 查询间隔(毫秒): ").append(queryDuration).append("\n");
        sb.append(", 撤销尝试次数: ").append(maxCancelRetry).append("\n");
        sb.append(", 撤销重试间隔(毫秒): ").append(cancelDuration).append("\n");
        sb.append("}");
        return sb.toString();
    }
    private String getKeyDescription(String key) {
        int showLength = 6;
        if (!StringUtils.isEmpty(key) && key.length() > showLength) {
            return new StringBuilder(key.substring(0, showLength)).append("******")
                    .append(key.substring(key.length() - showLength)).toString();
        }
        return null;
    }
}
