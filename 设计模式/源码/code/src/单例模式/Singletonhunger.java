package 单例模式;

/**
 * @author ruanxiangge
 * @date 2022/5/25 下午5:17
 * 单例模式（饿汉式）
 */
public class Singletonhunger{
    private static Singletonhunger instance = new Singletonhunger();

    private Singletonhunger(){}

    /**
     * 启动时对象直接创建，简答易懂，不存在并发问题
     * 但是对象会一直存在
     *
     */
    public static Singletonhunger getInstance(){
        return instance;
    }
}
