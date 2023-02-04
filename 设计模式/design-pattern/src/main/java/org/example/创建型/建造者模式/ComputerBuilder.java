package org.example.创建型.建造者模式;

/**
 * @author ruanxiangge
 * @date 2023/1/15 15:13
 */
public interface ComputerBuilder {
    void buildCpu();
    void buildMaidBoard();
    void buildDisk();
    void buildMemory();
    void buildPower();

    Computer createComputer();

}
