package org.example.创建型.工厂模式.方法工厂;



/**
 * @author ruanxiangge
 * @date 2023/1/8 21:28
 * 抽象工厂
 */
public interface IPayFactory {

    /**
     * 获取具体工厂
     */
    IPay getPay();
}
