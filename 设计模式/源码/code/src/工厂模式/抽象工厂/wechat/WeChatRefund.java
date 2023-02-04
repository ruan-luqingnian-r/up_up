package 工厂模式.抽象工厂.wechat;

import 工厂模式.抽象工厂.RefundFactory;

/**
 * @author ruanxiangge
 * @date 2022/6/5 下午3:00
 */
public class WeChatRefund implements RefundFactory {

    /**
     * 退款接口
     */
    @Override
    public void refund() {
        System.out.println("微信退款成功");
    }
}
