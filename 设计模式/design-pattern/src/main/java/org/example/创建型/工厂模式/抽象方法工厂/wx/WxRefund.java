package org.example.创建型.工厂模式.抽象方法工厂.wx;

import org.example.创建型.工厂模式.抽象方法工厂.IRefundFactory;

/**
 * @author ruanxiangge
 * @since 2023/1/8
 */
public class WxRefund implements IRefundFactory {
    @Override
    public void unifiedRefund() {
        System.out.println("微信退款");
    }
}
