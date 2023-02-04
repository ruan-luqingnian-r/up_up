package 工厂模式.工厂方法;

import 工厂模式.Pay;
import 工厂模式.PayType;

import java.util.Scanner;

/**
 * @author ruanxiangge
 * @date 2022/6/2 下午12:33
 */
public class Main {

    public static void main(String[] args) {

        Pay pay = null;

        System.out.println("请输入支付类型 1 微信 2 支付宝");
        Scanner scanner = new Scanner(System.in);
        int payTypeCode = scanner.nextInt();

        if (payTypeCode <= 0){
            System.out.println("参数异常，支付创建失败");
        }else if (PayType.WE_CHAT_PAY.getCode() == payTypeCode){
            PayFactory payFactory = new WeChatPayFactory();
            pay = payFactory.getPay();
        }else if (PayType.AIL_PAY.getCode() == payTypeCode){
            AliPayFactory aliPayFactory = new AliPayFactory();
            pay = aliPayFactory.getPay();
        }
        if (null != pay){
            pay.unifiedOrder();
        }
    }
}
