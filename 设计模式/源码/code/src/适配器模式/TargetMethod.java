package 适配器模式;

/**
 * @author ruanxiangge
 * @date 2022/6/26 下午8:52
 * 将要被实现的信息方法
 */
public interface TargetMethod {

    /**
     * 被适配的旧方法
     */
    void methodA();

    /**
     * 新方法
     */
    void methodB();

    /**
     * 新方法
     */
    void methodC();
}
