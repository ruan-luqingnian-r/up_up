package 工厂模式.工厂方法;

import 工厂模式.AilPay;
import 工厂模式.Pay;

/**
 * @author ruanxiangge
 * @date 2022/6/2 下午12:26
 * 支付宝支付工厂方法
 */
public class AliPayFactory implements PayFactory {

    /**
     * 获取支付
     *
     * @return
     */
    @Override
    public Pay getPay() {
        return new AilPay();
    }
}
