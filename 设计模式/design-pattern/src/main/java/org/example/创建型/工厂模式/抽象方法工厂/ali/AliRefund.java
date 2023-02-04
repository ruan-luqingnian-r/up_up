package org.example.创建型.工厂模式.抽象方法工厂.ali;

import org.example.创建型.工厂模式.抽象方法工厂.IRefundFactory;

/**
 * @author ruanxiangge
 * @since 2023/1/8
 */
public class AliRefund implements IRefundFactory {
    @Override
    public void unifiedRefund() {
        System.out.println("支付宝退款");
    }
}
