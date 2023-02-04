package org.example.创建型.建造者模式;

/**
 * @author ruanxiangge
 * @since 2023/1/15
 */
public class Director {
    public Computer create(ComputerBuilder builder){
        builder.buildCpu();
        builder.buildMemory();
        builder.buildDisk();
        builder.buildPower();
        builder.buildPower();
        return builder.createComputer();
    }
}
