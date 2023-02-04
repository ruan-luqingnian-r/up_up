package 单例模式;

/**
 * @author ruanxiangge
 * @date 2022/5/25 下午2:56
 * 单例设计模式（懒汉式）
 */
public class SingletonLazy {

    private static volatile SingletonLazy instance;

    /**
     * 私有化构造方法
     */
    private SingletonLazy(){
    }

    /**
     * 第一种方式
     * 线程不安全
     * 对外暴露一个实例化方法
     */
    public static SingletonLazy getInstance1(){
        if (instance == null){
            instance = new SingletonLazy();
        }
        return instance;
    }

    /**
     * 第二种方式
     * 对外暴露一个实例化方法
     *
     * 线程加锁,通过synchronized进行加锁
     * 但依旧存在线程安全问题：
     * 同时进入两个线程，判空通过，线程A获得锁后创建对象释放，线程B则可以获取锁后创建实例对象
     */
    public static SingletonLazy getInstance2(){
        if (instance == null){
            synchronized (SingletonLazy.class){
                instance = new SingletonLazy();
            }
        }
        return instance;
    }

    /**
     * 第三种实现方式
     * 双重锁定检查，多线程下保证高性能
     * 是否安全？
     * instance = new SingletonLazy();不是原子性操作，可能存在指令重排序的可能
     * 放在指令重排序volatile
     */
    public static SingletonLazy getInstance3(){
            if (instance == null){
                synchronized (SingletonLazy.class){
                    if (instance == null){
                        instance = new SingletonLazy();
                    }

                }
            }

        return instance;
    }
}
