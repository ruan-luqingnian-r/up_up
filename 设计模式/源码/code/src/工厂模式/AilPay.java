package 工厂模式;

/**
 * @author ruanxiangge
 * @date 2022/6/1 下午10:32
 * 支付宝支付实现类
 */
public class AilPay implements Pay {
    /**
     * 统一下单接口
     */
    @Override
    public void unifiedOrder() {
        // TODO 业务逻辑
        System.out.println("支付宝下单成功");

    }
}
