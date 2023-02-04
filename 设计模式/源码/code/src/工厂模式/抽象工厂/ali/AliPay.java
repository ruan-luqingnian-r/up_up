package 工厂模式.抽象工厂.ali;

import 工厂模式.抽象工厂.PayFactory;

/**
 * @author ruanxiangge
 * @date 2022/6/5 下午2:30
 */
public class AliPay implements PayFactory {

    /**
     * 统一下单接口
     */
    @Override
    public void unifiedOrder() {
        // TODO 业务逻辑
        System.out.println("使用支付宝下单成功");
    }
}
