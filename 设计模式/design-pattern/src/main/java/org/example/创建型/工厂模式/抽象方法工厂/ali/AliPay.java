package org.example.创建型.工厂模式.抽象方法工厂.ali;

import org.example.创建型.工厂模式.抽象方法工厂.IPayFactory;

/**
 * @author ruanxiangge
 * @since 2023/1/8
 */
public class AliPay implements IPayFactory {
    @Override
    public void unifiedOrder() {
        System.out.println("支付宝支付");
    }
}
