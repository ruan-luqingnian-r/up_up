package org.example.创建型.单例模式;

/**
 * @author ruanxiangge
 * @since 2023/1/8
 * 单例-饿汉
 * 实现简单-但是有内存一直占用
 */
public class SingletonHungry {

    private static SingletonHungry instance = new SingletonHungry();
    private SingletonHungry(){}

    public void process(){
        System.out.println("单例-饿汉-实例");
    }

    public static SingletonHungry getInstance(){
        return instance;
    }
}
