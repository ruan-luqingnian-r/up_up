package 工厂模式.工厂方法;

import 工厂模式.Pay;

/**
 * @author ruanxiangge
 * @date 2022/6/2 下午12:20
 */
public interface PayFactory {

    /**
     * 获取支付
     * @return
     */
    Pay getPay();
}
