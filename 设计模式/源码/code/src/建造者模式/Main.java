package 建造者模式;

/**
 * @author ruanxiangge
 * @date 2022/6/22 下午6:53
 */
public class Main {
    public static void main(String[] args) {

        /**
         * 在jkd中的应用
         * tcp传输协议protobuf生成的api
         * java中的StringBuilder（不完全一样，思想不一样）
         */

        Computer highComputer = new Director().create(new BuilderHighComputer());

        System.out.println(highComputer);

        Computer lowComputer = new Director().create(new BuilderLowComputer());

        System.out.println(lowComputer);


    }
}
