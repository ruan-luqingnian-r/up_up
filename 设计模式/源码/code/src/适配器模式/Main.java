package 适配器模式;

/**
 * @author ruanxiangge
 * @date 2022/6/26 下午8:57
 */
public class Main {

    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        adapter.methodA();
        adapter.methodB();
        adapter.methodC();
    }
}
