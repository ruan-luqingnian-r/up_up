package 工厂模式.抽象工厂.wechat;

import 工厂模式.抽象工厂.OrderFactory;
import 工厂模式.抽象工厂.PayFactory;
import 工厂模式.抽象工厂.RefundFactory;

/**
 * @author ruanxiangge
 * @date 2022/6/5 下午2:49
 */
public class WeChatOrderFactory implements OrderFactory {

    /**
     * 创建支付
     *
     * @return
     */
    @Override
    public PayFactory createPay() {
        return new WeChatPay();
    }

    /**
     * 创建退款
     *
     * @return
     */
    @Override
    public RefundFactory createRefund() {
        return new WeChatRefund();
    }
}
