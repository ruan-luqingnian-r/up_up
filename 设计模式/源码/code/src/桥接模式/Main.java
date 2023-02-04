package 桥接模式;

/**
 * @author ruanxiangge
 * @since 2022/7/6
 */
public class Main {
    public static void main(String[] args) {
        HWPhone hwPhone = new HWPhone(new BlueColor());
        hwPhone.run();
    }
}
