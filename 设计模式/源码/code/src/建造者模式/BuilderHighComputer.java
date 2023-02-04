package 建造者模式;

/**
 * @author ruanxiangge
 * @date 2022/6/22 下午6:41
 * 创建电脑(高配)
 */
public class BuilderHighComputer implements Builder{
    
    private Computer computer = new Computer();

    /**
     * 创建CPU
     */
    @Override
    public void buildCpu() {
        computer.setCpu("高端 cpu");
    }

    /**
     * 创建显卡
     */
    @Override
    public void buildGraphicsCard() {
        computer.setGraphicsCard("高端 显卡");
    }

    /**
     * 创建主版
     */
    @Override
    public void buildMainBoard() {
        computer.setMainBoard("高端 主板");
    }

    /**
     * 创建磁盘
     */
    @Override
    public void buildDisk() {
        computer.setDisk("高端 磁盘");
    }

    /**
     * 创建内存
     */
    @Override
    public void buildMemory() {
        computer.setMemory("高端 内存");
    }

    /**
     * 创建电源
     */
    @Override
    public void buildPower() {
        computer.setPower("高端 电源");
    }

    /**
     * 创建电脑
     *
     * @return 电脑类
     */
    @Override
    public Computer createComputer() {
        return computer;
    }
}
