package 工厂模式.简单工厂;

import 工厂模式.Pay;

/**
 * @author ruanxiangge
 * @date 2022/6/1 下午10:44
 */
public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) {
            Pay pay = PayFactory.createPay(i);
            if (null != pay){
                pay.unifiedOrder();
            }
            System.out.println("======");
        }

    }
}
