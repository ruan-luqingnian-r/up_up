package org.example.创建型.工厂模式.简单工厂;

public class Main {
    public static void main(String[] args) {

        // String payType = "Wx";
        String payType = "Ali";
        // String payType = "";
        // String payType = "123";

        Pay pay = SimplePayFactory.creatPay(payType);
        if (null == pay){
            System.out.println("支付方法不可用");
        }else {
            pay.unifiedOrder();
        }
    }
}