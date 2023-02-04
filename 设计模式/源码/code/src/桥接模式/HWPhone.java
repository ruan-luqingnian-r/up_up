package 桥接模式;

/**
 * @author ruanxiangge
 * @since 2022/7/6
 */
public class HWPhone extends Phone{

    public HWPhone(Color color){
        super.setColor(color);
    }

    @Override
    public void run() {
        color.useColor();
        System.out.println("华为手机");
    }
}
