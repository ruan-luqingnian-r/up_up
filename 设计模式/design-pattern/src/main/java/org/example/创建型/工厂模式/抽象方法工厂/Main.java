package org.example.创建型.工厂模式.抽象方法工厂;

import org.example.创建型.工厂模式.抽象方法工厂.ali.AliOrderFactory;
import org.example.创建型.工厂模式.抽象方法工厂.wx.WxOrderFactory;

public class Main {
    public static void main(String[] args) {
        // String payType = "Wx";
        String payType = "Ali";
        // String payType = "";
        // String payType = "123";

        OrderFactory orderFactory = FactoryProducer.creatPay(payType);
        if (null == orderFactory){
            System.out.println("支付方式不存在");
        }else {
            orderFactory.getOrder().unifiedOrder();
            orderFactory.getRefund().unifiedRefund();
        }

    }
}