package org.example.创建型.工厂模式.方法工厂;

/**
 * @author ruanxiangge
 * @since 2023/1/8
 */
public class WeChatPayFactory implements IPayFactory{

    @Override
    public IPay getPay() {
        return new WeChatPay();
    }
}
