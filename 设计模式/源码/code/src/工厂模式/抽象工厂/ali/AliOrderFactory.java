package 工厂模式.抽象工厂.ali;

import 工厂模式.抽象工厂.OrderFactory;
import 工厂模式.抽象工厂.PayFactory;
import 工厂模式.抽象工厂.RefundFactory;

/**
 * @author ruanxiangge
 * @date 2022/6/5 下午2:29
 */
public class AliOrderFactory implements OrderFactory {

    /**
     * 创建支付
     *
     * @return
     */
    @Override
    public PayFactory createPay() {
        return new AliPay();
    }

    /**
     * 创建退款
     *
     * @return
     */
    @Override
    public RefundFactory createRefund() {
        return new AliRefund();
    }
}
