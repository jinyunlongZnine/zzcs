package com.realizeType;

import org.junit.Test;

/**
 * @Companny shineyue
 * @Author jinyunlong
 * @Created 2020/1/9
 * @Description
 */
public class Test01 {

    @Test
    public void test0101() throws CloneNotSupportedException {
        RealizeType realizeType1 = new RealizeType();
        RealizeType realizeType2 = (RealizeType) realizeType1.clone();
        System.out.println(realizeType1 == realizeType2 ? "yes":"no");
    }
}
