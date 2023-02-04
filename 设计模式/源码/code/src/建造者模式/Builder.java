package 建造者模式;

/**
 * @author ruanxiangge
 * @date 2022/6/22 下午6:07
 * 设计模式建造者模式
 * 接口类完成建造电脑细节方法
 */
public interface Builder {

    /**
     * 创建CPU
     */
    void buildCpu();

    /**
     * 创建显卡
     */
    void buildGraphicsCard();

    /**
     * 创建主版
     */
    void buildMainBoard();

    /**
     * 创建磁盘
     */
    void buildDisk();

    /**
     * 创建内存
     */
    void buildMemory();


    /**
     * 创建电源
     */
    void buildPower();

    /**
     * 创建电脑
     * @return 电脑类
     */
    Computer createComputer();

}
