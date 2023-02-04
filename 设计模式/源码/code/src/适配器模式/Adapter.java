package 适配器模式;

/**
 * @author ruanxiangge
 * @date 2022/6/26 下午8:53
 * 适配器
 */
public class Adapter extends OldMethod implements TargetMethod {

    /**
     * 新方法
     */
    @Override
    public void methodB() {
        System.out.println("Adapter : methodB");
    }

    /**
     * 新方法
     */
    @Override
    public void methodC() {
        System.out.println("Adapter : methodC");
    }
}
