package com.singleton;

/**
 * @Companny shineyue
 * @Author jinyunlong
 * @Created 2020/1/9
 * @Description懒汉式单例设计模式
 */
public class LazySingleton {
    //构造方法私有;
    private LazySingleton() {
    }

    private static volatile LazySingleton lazySingleton = null;  //保证 instance 在所有线程中同步

    public static synchronized LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
    /**
     注意：如果编写的是多线程程序，则不要删除上例代码中的关键字 volatile 和 synchronized，
     否则将存在线程非安全的问题。如果不删除这两个关键字就能保证线程安全，
     但是每次访问时都要同步，会影响性能，且消耗更多的资源，这是懒汉式单例的缺点。
     */

}
