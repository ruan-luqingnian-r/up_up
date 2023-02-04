package org.example.创建型.工厂模式.抽象方法工厂.wx;

import org.example.创建型.工厂模式.抽象方法工厂.IPayFactory;
import org.example.创建型.工厂模式.抽象方法工厂.IRefundFactory;
import org.example.创建型.工厂模式.抽象方法工厂.OrderFactory;

/**
 * @author ruanxiangge
 * @since 2023/1/8
 */
public class WxPay implements IPayFactory {

    @Override
    public void unifiedOrder() {
        System.out.println("微信支付");
    }
}
