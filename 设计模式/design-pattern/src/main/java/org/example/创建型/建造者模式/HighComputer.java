package org.example.创建型.建造者模式;

/**
 * @author ruanxiangge
 * @since 2023/1/15
 */
public class HighComputer implements ComputerBuilder{

    Computer computer = new Computer();

    @Override
    public void buildCpu() {
        computer.setCpu("高配 CPU");
    }

    @Override
    public void buildMaidBoard() {
        computer.setMainBoard("高配 主板");
    }

    @Override
    public void buildDisk() {
        computer.setDisk("高配 磁盘");
    }

    @Override
    public void buildMemory() {
        computer.setMemory("高配 内存");
    }

    @Override
    public void buildPower() {
        computer.setPower("高配 电源");
    }

    @Override
    public Computer createComputer() {
        return computer;
    }
}
