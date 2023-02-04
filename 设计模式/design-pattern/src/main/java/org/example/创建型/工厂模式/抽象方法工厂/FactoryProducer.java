package org.example.创建型.工厂模式.抽象方法工厂;

import org.example.创建型.工厂模式.抽象方法工厂.ali.AliOrderFactory;
import org.example.创建型.工厂模式.抽象方法工厂.wx.WxOrderFactory;
import org.example.创建型.工厂模式.简单工厂.AilPay;
import org.example.创建型.工厂模式.简单工厂.Pay;
import org.example.创建型.工厂模式.简单工厂.WeChatPay;

/**
 * @author ruanxiangge
 * @since 2023/1/8
 * 工厂创造器
 */
public class FactoryProducer {

    public static OrderFactory creatPay(String payType){
        if (payType == null || payType.length() == 0){
            return null;
        }
        if (payType.equals("Wx")){
            return new WxOrderFactory();
        }else if (payType.equals("Ali")){
            return new AliOrderFactory();
        }else {
            return null;
        }
    }
}
