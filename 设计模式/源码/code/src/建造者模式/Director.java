package 建造者模式;

/**
 * @author ruanxiangge
 * @date 2022/6/22 下午6:57
 */
public class Director {

    public Computer create(Builder builder){
        builder.buildMemory();
        builder.buildGraphicsCard();
        builder.buildCpu();
        builder.buildMainBoard();
        builder.buildDisk();
        builder.buildPower();
        return builder.createComputer();
    }

}
