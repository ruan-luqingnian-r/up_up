package org.example.创建型.工厂模式.简单工厂;

/**
 * @author ruanxiangge
 * @since 2023/1/8
 * 简单支付工厂
 */
public class SimplePayFactory {

    public static Pay creatPay(String payType){
        if (payType == null || payType.length() == 0){
            return null;
        }
        if (payType.equals("Wx")){
            return new WeChatPay();
        }else if (payType.equals("Ali")){
            return new AilPay();
        }else {
            return null;
        }
    }
}
