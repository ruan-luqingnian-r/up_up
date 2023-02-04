package 工厂模式.简单工厂;

import 工厂模式.AilPay;
import 工厂模式.Pay;
import 工厂模式.PayType;
import 工厂模式.WeChatPay;

/**
 * @author ruanxiangge
 * @date 2022/6/1 下午10:36
 * 简单支付工厂
 */
public class PayFactory {

    /**
     * 根据传入的参数返回对应的支付对象
     * @param payTypeCode
     * @return
     */
    public static Pay createPay(int payTypeCode){
        if (payTypeCode <= 0){
            System.out.println("参数异常，支付创建失败");
            return null;
        }else if (PayType.WE_CHAT_PAY.getCode() == payTypeCode){
            return new WeChatPay();
        }else if (PayType.AIL_PAY.getCode() == payTypeCode){
            return new AilPay();
        }
        //有其他直接拓展
        return null;
    }
}
