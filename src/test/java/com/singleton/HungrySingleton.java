package com.singleton;

/**
 * @Companny shineyue
 * @Author jinyunlong
 * @Created 2020/1/9
 * @Description饿汉式单例设计模式
 */
public class HungrySingleton {

    //构造方法私有
    private  HungrySingleton(){};

    private static HungrySingleton hungrySingleton = new HungrySingleton();

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

}
