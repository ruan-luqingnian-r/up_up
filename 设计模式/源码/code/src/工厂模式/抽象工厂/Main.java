package 工厂模式.抽象工厂;

import 工厂模式.PayType;
import 工厂模式.工厂方法.AliPayFactory;
import 工厂模式.工厂方法.WeChatPayFactory;

import java.util.Scanner;

/**
 * @author ruanxiangge
 * @date 2022/6/5 下午2:53
 */
public class Main {
    public static void main(String[] args) {


        System.out.println("请输入支付类型 1 微信 2 支付宝");
        Scanner scanner = new Scanner(System.in);
        int payTypeCode = scanner.nextInt();

        if (payTypeCode <= 0){
            System.out.println("参数异常，支付创建失败");
        }else if (PayType.WE_CHAT_PAY.getCode() == payTypeCode){
            new WeChatPayFactory().getPay().unifiedOrder();
        }else if (PayType.AIL_PAY.getCode() == payTypeCode){
            new AliPayFactory().getPay().unifiedOrder();
        }
    }
}
