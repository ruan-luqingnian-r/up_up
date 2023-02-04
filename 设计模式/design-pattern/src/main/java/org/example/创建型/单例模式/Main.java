package org.example.创建型.单例模式;

public class Main {
    public static void main(String[] args) {
        /**
         * jdk源码中
         * RunTime/Desktop都使用了单例模式
         */
        SingletonLazy.getInstance().process();
        SingletonHungry.getInstance().process();
    }
}