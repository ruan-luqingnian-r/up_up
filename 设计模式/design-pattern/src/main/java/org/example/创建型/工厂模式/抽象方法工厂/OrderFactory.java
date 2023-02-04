package org.example.创建型.工厂模式.抽象方法工厂;

/**
 * @author ruanxiangge
 * @since 2023/1/8
 */
public interface OrderFactory {
    /**
     * 统一下单
     */
    IPayFactory getOrder();

    /**
     * 统一退款
     */
    IRefundFactory getRefund();

}
