package org.example.创建型.工厂模式.方法工厂;

public class Main {
    public static void main(String[] args) {
        // IPayFactory payFactory = new AliPayFactory();
        IPayFactory payFactory = new WeChatPayFactory();
        payFactory.getPay().unifiedOrder();
    }
}