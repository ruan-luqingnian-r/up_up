package 桥接模式;

/**
 * @author ruanxiangge
 * @since 2022/7/6
 * 颜色实现类
 */
public class BlueColor implements Color{

    @Override
    public void useColor() {
        System.out.println("蓝色");
    }
}
