package org.example.创建型.建造者模式;

/**
 * @author ruanxiangge
 * @since 2023/1/15
 */
public class LowComputer implements ComputerBuilder{

    Computer computer = new Computer();

    @Override
    public void buildCpu() {
        computer.setCpu("低配 CPU");
    }

    @Override
    public void buildMaidBoard() {
        computer.setMainBoard("低配 主板");
    }

    @Override
    public void buildDisk() {
        computer.setDisk("低配 磁盘");
    }

    @Override
    public void buildMemory() {
        computer.setMemory("低配 内存");
    }

    @Override
    public void buildPower() {
        computer.setPower("低配 电源");
    }

    @Override
    public Computer createComputer() {
        return computer;
    }
}
