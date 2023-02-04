package 桥接模式;

/**
 * @author ruanxiangge
 * @since 2022/7/6
 * 抽象手机类
 */
public abstract class Phone {


    protected  Color color;

    public void setColor(Color color) {
        this.color = color;
    }
    /**
     * 手机的方法
     */
    abstract public void run();
}
