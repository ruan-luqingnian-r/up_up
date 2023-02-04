package 工厂模式.抽象工厂.ali;

import 工厂模式.抽象工厂.RefundFactory;

/**
 * @author ruanxiangge
 * @date 2022/6/5 下午2:56
 */
public class AliRefund implements RefundFactory {
    /**
     * 退款接口
     */
    @Override
    public void refund() {
        System.out.println("支付宝退款成功");
    }
}
