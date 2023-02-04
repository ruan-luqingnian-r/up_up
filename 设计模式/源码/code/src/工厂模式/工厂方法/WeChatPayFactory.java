package 工厂模式.工厂方法;

import 工厂模式.Pay;
import 工厂模式.WeChatPay;

/**
 * @author ruanxiangge
 * @date 2022/6/2 下午12:29
 */
public class WeChatPayFactory implements PayFactory{

    /**
     * 获取支付
     *
     * @return
     */
    @Override
    public Pay getPay() {
        return new WeChatPay();
    }
}
