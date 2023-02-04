package org.example.创建型.单例模式;

/**
 * @author ruanxiangge
 * @since 2023/1/8
 * 单例-懒汉
 */
public class SingletonLazy {

    /**
     * 不创建实例
     */
    private static volatile SingletonLazy instance;

    /**
     * 私有化构造方法
     */
    private SingletonLazy(){}

    public void process(){
        System.out.println("单例-懒汉-实例");
    }

    /**
     * 对外暴露一个方法提供实例
     * 锁保证单例创建
     * Double-Check-Null
     * volatile保证避免指令重排序
     * @return
     */
    public static SingletonLazy getInstance(){
        if (null == instance){
            synchronized (SingletonLazy.class){
                if (null == instance){
                    instance =  new SingletonLazy();
                }
            }
        }
        return instance;
    }
}
