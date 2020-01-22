package com.testSingleton;

import com.singleton.HungrySingleton;
import com.singleton.LazySingleton;
import org.junit.Test;

/**
 * @Companny shineyue
 * @Author jinyunlong
 * @Created 2020/1/9
 * @Description
 */
public class TestSingleton {

     @Test
    public void test01(){
        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println("lazySingleton = " + lazySingleton);

    }

    @Test
    public void testHungrySingleton(){
        System.out.println(HungrySingleton.getInstance()); ;
    }
}
