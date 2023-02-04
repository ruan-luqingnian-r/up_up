package org.example.创建型.工厂模式.方法工厂;

/**
 * @author ruanxiangge
 * @since 2023/1/8
 * 微信支付工厂
 */
public class WeChatPay implements IPay {

    @Override
    public void unifiedOrder() {
        System.out.println("微信支付");
    }
}
