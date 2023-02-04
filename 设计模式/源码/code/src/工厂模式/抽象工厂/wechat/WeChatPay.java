package 工厂模式.抽象工厂.wechat;

import 工厂模式.抽象工厂.PayFactory;

/**
 * @author ruanxiangge
 * @date 2022/6/5 下午2:50
 */
public class WeChatPay implements PayFactory {

    /**
     * 统一下单接口
     */
    @Override
    public void unifiedOrder() {
        System.out.println("使用微信支付下单成功");
    }
}
