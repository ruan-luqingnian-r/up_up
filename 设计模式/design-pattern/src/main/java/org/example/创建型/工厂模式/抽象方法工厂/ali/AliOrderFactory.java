package org.example.创建型.工厂模式.抽象方法工厂.ali;

import org.example.创建型.工厂模式.抽象方法工厂.IPayFactory;
import org.example.创建型.工厂模式.抽象方法工厂.IRefundFactory;
import org.example.创建型.工厂模式.抽象方法工厂.OrderFactory;

/**
 * @author ruanxiangge
 * @since 2023/1/8
 */
public class AliOrderFactory implements OrderFactory {
    @Override
    public IPayFactory getOrder() {
        return new AliPay();
    }

    @Override
    public IRefundFactory getRefund() {
        return new AliRefund();
    }
}
