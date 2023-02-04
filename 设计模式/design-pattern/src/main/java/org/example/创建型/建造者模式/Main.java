package org.example.创建型.建造者模式;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        Computer lowComputer = director.create(new LowComputer());
        Computer highComputer = director.create(new HighComputer());

        System.out.println(lowComputer);
        System.out.println(highComputer);
    }
}