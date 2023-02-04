package org.example.创建型.工厂模式.抽象方法工厂.wx;

import org.example.创建型.工厂模式.抽象方法工厂.IPayFactory;
import org.example.创建型.工厂模式.抽象方法工厂.IRefundFactory;
import org.example.创建型.工厂模式.抽象方法工厂.OrderFactory;

/**
 * @author ruanxiangge
 * @since 2023/1/8
 */
public class WxOrderFactory implements OrderFactory {
    @Override
    public IPayFactory getOrder() {
        return new WxPay();
    }

    @Override
    public IRefundFactory getRefund() {
        return new WxRefund();
    }
}
