package 工厂模式.抽象工厂;

/**
 * @author ruanxiangge
 * @date 2022/6/5 下午2:11
 * 订单超级工厂
 * 创建支付-退款工厂
 */
public interface OrderFactory {

    /**
     * 创建支付
     * @return
     */
    PayFactory createPay();

    /**
     * 创建退款
     * @return
     */
    RefundFactory createRefund();
}
